package com.github.tommyettinger.crux;

/**
 * Groups functionality common to points with float components, in any dimension.
 * Implementing this can seem tricky; it involves one of the sub-interfaces of PointN in this package,
 * as well as the implementing type. For the example class {@code Point3Float}, the implementation looks like
 * {@code public class Point3Float implements Point3<Point3Float>, PointNFloat<Point3Float, Point3<?>>}.
 *
 * @param <P> should be the subclassing type itself
 * @param <R> should be a wildcard-generic type for a sub-interface of {@link PointN}, such as {@code Point3<?>}
 */
public interface PointNFloat<P extends PointNFloat<P, R>, R extends PointN<?>> extends PointN<P> {
    @Override
    default boolean floatingPoint() {
        return true;
    }

    /**
     * Assigns to each component of this point {@code 1f} divided by its original value.
     * If a component is 0.0f, its value after this will be positive infinity.
     * If a component is -0.0f, its value after this will be negative infinity.
     * If a component is NaN, its value after this will be NaN.
     * <br>
     * This has a default implementation, but most classes that implement this are recommended to by
     * simply using {@code x = 1f / x;} and so on, then returning the current type instead of PointNFloat.
     *
     * @return 1f divided by this point, assigned in-place to this
     */
    default PointNFloat<P, R> inverse () {
        for (int i = 0, r = rank(); i < r; i++) {
            setAt(i, 1f / get(i));
        }
        return this;
    }

    /**
     * Gets the component at the specified index.
     * Kotlin-compatible using square-bracket indexing.
     * @param index which component to get, in order
     * @return the component
     */
    float get (int index);

    /**
     * Sets the component at the specified index to the specified value.
     * @param index which component to set, in order
     * @param value the value to assign at index
     * @return this, for chaining
     */
    P setAt(int index, float value);

    /**
     * Linear-interpolates from this point toward target, moving a distance proportional to alpha and changing this
     * point in-place if possible. If this point is not {@link #mutable()}, this will return a new or pooled point.
     * The alpha is expected to be in the 0 to 1 range, inclusive.
     * @param target any point with the same dimension to move toward
     * @param alpha between 0 and 1, inclusive
     * @return this point after modifications, if possible, or a new PointNFloat if this is immutable
     */
    P lerp(R target, float alpha);
}
