package com.github.tommyettinger.crux;

/**
 * A minimal super-interface that can be implemented by 4D {@link PointN} types, such as (subclasses of)
 * {@code com.badlogic.gdx.math.Vector4}. Four-dimensional points can be used to represent points in 3D space at a
 * particular point in time, to represent RGBA colors, or to actually represent a point with four spatial dimensions.
 * Sometimes, they can be used to represent quaternions. With some caveats, they could be used to represent pairs of
 * 2D points, but operations like normalization aren't meaningful in that case.
 *
 * @param <P> in implementing types, this is the implementing type
 */
public interface Point4<P extends Point4<P>> extends PointN<P> {
    /**
     * Gets the first (x) coordinate. Always gets a float, even if {@link #floatingPoint()} is false.
     * @return the first (x) coordinate
     */
    float x();

    /**
     * Gets the first (x) coordinate. Always gets an int; if {@link #floatingPoint()} is true, this defaults to casting
     * {@link #x()} to an int. Implementations where floatingPoint() is false should override this and return their
     * actual int data.
     * @return the first (x) coordinate, as an int
     */
    default int xi() {
        return (int)x();
    }

    /**
     * Sets the first (x) coordinate to {@code next}. Always takes a float, even if {@link #floatingPoint()} is false.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param next the new value for the first (x) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    P x(float next);

    /**
     * Sets the first (x) coordinate to {@code next}. Always takes an int, and this can be overridden to assign to
     * internal data stored as an int, long, or double without losing precision from using a float.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param next the new value for the first (x) coordinate, as an int
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    default P xi(int next) {
        return x(next);
    }

    /**
     * Gets the second (y) coordinate. Always gets a float, even if {@link #floatingPoint()} is false.
     * @return the second (y) coordinate
     */
    float y();

    /**
     * Gets the second (y) coordinate. Always gets an int; if {@link #floatingPoint()} is true, this defaults to casting
     * {@link #y()} to an int. Implementations where floatingPoint() is false should override this and return their
     * actual int data.
     * @return the second (y) coordinate, as an int
     */
    default int yi() {
        return (int)y();
    }

    /**
     * Sets the second (y) coordinate to {@code next}. Always takes a float, even if {@link #floatingPoint()} is false.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param next the new value for the second (y) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    P y(float next);

    /**
     * Sets the second (y) coordinate to {@code next}. Always takes an int, and this can be overridden to assign to
     * internal data stored as an int, long, or double without losing precision from using a float.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param next the new value for the second (y) coordinate, as an int
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    default P yi(int next) {
        return y(next);
    }

    /**
     * Gets the third (z) coordinate. Always gets a float, even if {@link #floatingPoint()} is false.
     * @return the third (z) coordinate
     */
    float z();

    /**
     * Gets the third (z) coordinate. Always gets an int; if {@link #floatingPoint()} is true, this defaults to casting
     * {@link #z()} to an int. Implementations where floatingPoint() is false should override this and return their
     * actual int data.
     * @return the third (z) coordinate, as an int
     */
    default int zi() {
        return (int)z();
    }

    /**
     * Sets the third (z) coordinate to {@code next}. Always takes a float, even if {@link #floatingPoint()} is false.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param next the new value for the third (z) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    P z(float next);

    /**
     * Sets the third (z) coordinate to {@code next}. Always takes an int, and this can be overridden to assign to
     * internal data stored as an int, long, or double without losing precision from using a float.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param next the new value for the third (z) coordinate, as an int
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    default P zi(int next) {
        return z(next);
    }


    /**
     * Gets the fourth (w) coordinate. Always gets a float, even if {@link #floatingPoint()} is false.
     * @return the fourth (w) coordinate
     */
    float w();

    /**
     * Gets the fourth (w) coordinate. Always gets an int; if {@link #floatingPoint()} is true, this defaults to casting
     * {@link #w()} to an int. Implementations where floatingPoint() is false should override this and return their
     * actual int data.
     * @return the fourth (w) coordinate, as an int
     */
    default int wi() {
        return (int)w();
    }

    /**
     * Sets the fourth (w) coordinate to {@code next}. Always takes a float, even if {@link #floatingPoint()} is false.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param next the new value for the fourth (w) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    P w(float next);

    /**
     * Sets the fourth (w) coordinate to {@code next}. Always takes an int, and this can be overridden to assign to
     * internal data stored as an int, long, or double without losing precision from using a float.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param next the new value for the fourth (w) coordinate, as an int
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    default P wi(int next) {
        return w(next);
    }

    /**
     * Sets all coordinates to the given values. Always takes floats, even if {@link #floatingPoint()} is false.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param x the new value for the first (x) coordinate
     * @param y the new value for the second (y) coordinate
     * @param z the new value for the third (z) coordinate
     * @param w the new value for the fourth (w) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    P set(float x, float y, float z, float w);

    /**
     * Sets all coordinates to the given values. Always takes ints, and this can be overridden to assign to
     * internal data stored as an int, long, or double without losing precision from using a float.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param x the new value for the first (x) coordinate
     * @param y the new value for the second (y) coordinate
     * @param z the new value for the third (z) coordinate
     * @param w the new value for the fourth (w) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    default P seti(int x, int y, int z, int w) {
        return set(x, y, z, w);
    }

    /**
     * Gets how many components this type of point has; 4 here. This could also be called the dimensionality.
     *
     * @return how many components this type of point has (4)
     */
    default int rank() {
        return 4;
    }
}
