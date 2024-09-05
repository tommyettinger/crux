package com.github.tommyettinger.crux;

/**
 * A minimal super-interface that can be implemented by 3D {@link PointN} types, such as (subclasses of)
 * {@code com.badlogic.gdx.math.GridPoint3} and {@code com.badlogic.gdx.math.Vector3}.
 * @param <P> in implementing types, this is the implementing type
 */
public interface Point3<P extends Point3<P>> extends PointN<P> {
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
     * Sets all coordinates to the given values. Always takes floats, even if {@link #floatingPoint()} is false.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param x the new value for the first (x) coordinate
     * @param y the new value for the second (y) coordinate
     * @param z the new value for the third (z) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    P set(float x, float y, float z);

    /**
     * Sets all coordinates to the given values. Always takes ints, and this can be overridden to assign to
     * internal data stored as an int, long, or double without losing precision from using a float.
     * For mutable types, this should edit this value in-place. For immutable types, it must return a new value.
     * @param x the new value for the first (x) coordinate
     * @param y the new value for the second (y) coordinate
     * @param z the new value for the third (z) coordinate
     * @return if this is mutable, then this value after editing; if this is immutable, then a different edited point
     */
    default P seti(int x, int y, int z) {
        return set(x, y, z);
    }

    /**
     * Gets how many components this type of point has; 3 here. This could also be called the dimensionality.
     *
     * @return how many components this type of point has (3)
     */
    default int rank() {
        return 3;
    }
}
