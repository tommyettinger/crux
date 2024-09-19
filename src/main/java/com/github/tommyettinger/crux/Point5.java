package com.github.tommyettinger.crux;

/**
 * A minimal super-interface that can be implemented by 5D {@link PointN} types. There are no current 5D point classes
 * that could implement this in libGDX or other evaluated libraries, so any implementing class would need to start from
 * "scratch" and the support provided by PointN. Five-dimensional points can be used to represent a handful of uncommon
 * things, but they seem most useful for simply representing points in 5D space. An example usage would be to make a
 * looping animation of a 3D object by moving 5D points through 3D space and 2D time, with both the space and time
 * taking equal-length circular paths. That probably doesn't make much sense to most people, and likewise, most people
 * won't ever need to think about 5D space -- or to use this interface.
 *
 * @param <P> in implementing types, this is the implementing type
 */
public interface Point5<P extends Point5<P>> extends PointN<P> {
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
     * Gets the fifth (u) coordinate. Always gets a float, even if {@link #floatingPoint()} is false.
     * @return the fifth (u) coordinate
     */
    float u();

    /**
     * Gets the fifth (u) coordinate. Always gets an int; if {@link #floatingPoint()} is true, this defaults to casting
     * {@link #u()} to an int. Implementations where floatingPoint() is false should override this and return their
     * actual int data.
     * @return the fifth (u) coordinate, as an int
     */
    default int ui() {
        return (int)u();
    }

    /**
     * Sets the fifth (u) coordinate to {@code next}. Always takes a float, even if {@link #floatingPoint()} is false.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param next the new value for the fifth (u) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    P u(float next);

    /**
     * Sets the fifth (u) coordinate to {@code next}. Always takes an int, and this can be overridden to assign to
     * internal data stored as an int, long, or double without losing precision from using a float.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param next the new value for the fifth (u) coordinate, as an int
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    default P ui(int next) {
        return u(next);
    }

    /**
     * Sets all coordinates to the given values. Always takes floats, even if {@link #floatingPoint()} is false.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param x the new value for the first (x) coordinate
     * @param y the new value for the second (y) coordinate
     * @param z the new value for the third (z) coordinate
     * @param w the new value for the fourth (w) coordinate
     * @param u the new value for the fifth (u) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    P set(float x, float y, float z, float w, float u);

    /**
     * Sets all coordinates to the given values. Always takes ints, and this can be overridden to assign to
     * internal data stored as an int, long, or double without losing precision from using a float.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param x the new value for the first (x) coordinate
     * @param y the new value for the second (y) coordinate
     * @param z the new value for the third (z) coordinate
     * @param w the new value for the fourth (w) coordinate
     * @param u the new value for the fifth (u) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    default P seti(int x, int y, int z, int w, int u) {
        return set(x, y, z, w, u);
    }

    /**
     * Gets how many components this type of point has; 5 here. This could also be called the dimensionality.
     *
     * @return how many components this type of point has (5)
     */
    default int rank() {
        return 5;
    }
}
