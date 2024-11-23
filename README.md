# crux
## Shared interfaces for point types

This library provides some small interfaces meant to be shared by (subclasses of)
various incompatible types such as libGDX's GridPoint2, Vector2, GridPoint3,
Vector3, and Vector4, as well as SquidSquad's Coord, and potentially AWT's Point.
The code here was pulled from [gand](https://github.com/tommyettinger/gand), and
now gand depends on this.

The interfaces provided here can be used for mutable or immutable points, using
`int` or `float` components. Anything they provide in the form of default methods
can (and is sometimes meant to) be overridden by an implementing class. Code can
often be written to accept a more general type, such as `Point2`, instead of
requiring a specific class, such as `Vector2` or `GridPoint2`. You can get a
component as a float with the `x()` method or int with the `xi()` method, with
more of these for higher dimensions (y for 2D, z for 3D, etc.). There's also
overloads of these that take float (for `x()`) or int (for `xi()`) parameters, to
set that component. Setting edits the point in place if it is mutable, but if the
point is immutable, it either creates a copy or sometimes obtains an existing
immutable point from some type of pool. You can use `set()` to set with floats, or
`seti()` to set with ints.

Sometimes, though not often, you can even go as general as the superinterface of
all point types here, `PointN`. Using PointN is a little more limited, since it
doesn't even know what components a particular point will have, but an example
of types using it (from gand) would be:

```java
public class PathSmoother<V extends PointN<V>> {
    //...
}
```

You may want the more specialized library [gdcrux](https://github.com/tommyettinger/gdcrux), which extends existing
types from [libGDX](https://libgdx.com) when possible, but also implements crux interfaces. You might also be after a
different specialization using [digital](https://github.com/tommyettinger/digital) for core methods, which can be found
in [SquidSquad](https://github.com/yellowstonegames/SquidSquad), specifically its SquidGrid submodule. If you stick to
methods defined in crux, these two specializations can interoperate.

## Installation

The main way should be via Maven Central, where most libraries in the JVM ecosystem
tend to be downloaded from. The dependency is

```
api "com.github.tommyettinger:crux:$cruxVersion"
```
where `cruxVersion` is often defined in `gradle.properties` with

```
cruxVersion=0.1.2
```

You could instead replace any occurrences of `$cruxVersion` with `0.1.2` .

To depend on this on GWT, in addition to the earlier dependency in your core module
(assuming a libGDX project), you would have this dependency in your html module:

```
implementation "com.github.tommyettinger:crux:$cruxVersion:sources"
```

And this line in your `GdxDefinition.gwt.xml` file, before any inherits that might
use crux:

```
<inherits name="com.github.tommyettinger.crux" />
```

[You can also use JitPack](https://jitpack.io/#tommyettinger/crux) instead of Maven
Central. You probably want the latest commit, **not** the `-SNAPSHOT` version. If
you target GWT, you still need to append `:sources` after the version of the
JitPack dependency and use that in the html module, and use the same `inherits` line.

## License

[CC0 version 1.0](LICENSE).

## Name

The name was picked because the crux is a crucial *point* between (inter-, as in
*interface*) two parts. This is meant to bridge the libGDX-based position code
used by some of my libraries, like [gand](https://github.com/tommyettinger/gand),
with the independent position code used by
[SquidSquad](https://github.com/yellowstonegames/SquidSquad)'s SquidGrid module.