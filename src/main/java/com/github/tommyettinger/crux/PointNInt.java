package com.github.tommyettinger.crux;

/**
 * Groups functionality common to points with int components, in any dimension.
 * Implementing this can seem tricky; it involves one of the sub-interfaces of PointN in this package,
 * as well as the implementing type. For the example class {@code Point3Int}, the implementation looks like
 * {@code public class Point3Int implements Point3<Point3Int>, PointNInt<Point3Int, Point3<?>>}.
 * 
 * @param <P> should be the subclassing type itself
 * @param <R> should be a wildcard-generic type for a sub-interface of {@link PointN}, such as {@code Point3<?>}
 */
public interface PointNInt<P extends PointNInt<P, R>, R extends PointN<?>> extends PointN<P> {
    /**
     * This type does not natively use floating-point components, so
     * this returns false.
     * @return false
     */
    @Override
    default boolean floatingPoint() {
        return false;
    }

    /**
     * Gets the component at the specified index.
     * Kotlin-compatible using square-bracket indexing.
     * @param index which component to get, in order
     * @return the component
     */
    int get (int index);

    /**
     * Sets the component at the specified index to the specified value.
     * @param index which component to set, in order
     * @param value the value to assign at index
     * @return this, for chaining
     */
    P setAt(int index, int value);

    /**
     * Linear-interpolates from this point toward target, moving a distance proportional to alpha and changing this
     * point in-place if possible. If this point is not {@link #mutable()}, this will return a new or pooled point.
     * The alpha is expected to be in the 0 to 1 range, inclusive.
     * @param target any point with the same dimension to move toward
     * @param alpha between 0 and 1, inclusive
     * @return this point after modifications, if possible, or a new PointNInt if this is immutable
     */
    P lerp(R target, float alpha);
}
