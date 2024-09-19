package com.github.tommyettinger.crux;

/**
 * A minimal super-interface that can be implemented by 6D {@link PointN} types. There are no current 6D point classes
 * that could implement this in libGDX or other evaluated libraries, so any implementing class would need to start from
 * "scratch" and the support provided by PointN. Six-dimensional points can be used to represent a handful of uncommon
 * things, but in addition to representing points in 6D space, they can during the production of 3D tiling objects. An
 * example usage would be to make a 3D cube of generated values (such as cloud density) that can tile seamlessly on x,
 * y, or z. To do that, you would take a 3D input with x, y, and z, and create a Point6 using the values
 * {@code sin(x), sin(y), sin(z), cos(x), cos(y), cos(z)}, potentially scaling x, y, and z so one edge length on the
 * cube is {@code 2 * Math.PI} (which ensures this would loop). From there, the Point6 could be used to compute density
 * using a noise function or the like.
 *
 * @param <P> in implementing types, this is the implementing type
 */
public interface Point6<P extends Point6<P>> extends PointN<P> {
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
     * Gets the sixth (v) coordinate. Always gets a float, even if {@link #floatingPoint()} is false.
     * @return the sixth (v) coordinate
     */
    float v();

    /**
     * Gets the sixth (v) coordinate. Always gets an int; if {@link #floatingPoint()} is true, this defaults to casting
     * {@link #v()} to an int. Implementations where floatingPoint() is false should override this and return their
     * actual int data.
     * @return the sixth (v) coordinate, as an int
     */
    default int vi() {
        return (int)v();
    }

    /**
     * Sets the sixth (v) coordinate to {@code next}. Always takes a float, even if {@link #floatingPoint()} is false.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param next the new value for the sixth (v) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    P v(float next);

    /**
     * Sets the sixth (v) coordinate to {@code next}. Always takes an int, and this can be overridden to assign to
     * internal data stored as an int, long, or double without losing precision from using a float.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param next the new value for the sixth (v) coordinate, as an int
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    default P vi(int next) {
        return v(next);
    }

    /**
     * Sets all coordinates to the given values. Always takes floats, even if {@link #floatingPoint()} is false.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param x the new value for the first (x) coordinate
     * @param y the new value for the second (y) coordinate
     * @param z the new value for the third (z) coordinate
     * @param w the new value for the fourth (w) coordinate
     * @param u the new value for the fifth (u) coordinate
     * @param v the new value for the sixth (v) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    P set(float x, float y, float z, float w, float u, float v);

    /**
     * Sets all coordinates to the given values. Always takes ints, and this can be overridden to assign to
     * internal data stored as an int, long, or double without losing precision from using a float.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param x the new value for the first (x) coordinate
     * @param y the new value for the second (y) coordinate
     * @param z the new value for the third (z) coordinate
     * @param w the new value for the fourth (w) coordinate
     * @param u the new value for the fifth (u) coordinate
     * @param v the new value for the sixth (v) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    default P seti(int x, int y, int z, int w, int u, int v) {
        return set(x, y, z, w, u, v);
    }

    /**
     * Gets how many components this type of point has; 6 here. This could also be called the dimensionality.
     *
     * @return how many components this type of point has (6)
     */
    default int rank() {
        return 6;
    }
}
