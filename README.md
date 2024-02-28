# crux
## Shared interfaces for point types

This library provides some small interfaces meant to be shared by (subclasses of)
various incompatible types such as libGDX's GridPoint2, Vector2, GridPoint3, and
Vector3, as well as SquidSquad's Coord, and potentially AWT's Point. The code here
was pulled from [gand](https://github.com/tommyettinger/gand), and now gand
depends on this.

## Installation

The main way should be via Maven Central, where most libraries in the JVM ecosystem
tend to be downloaded from. The dependency is

```
api "com.github.tommyettinger:crux:$cruxVersion"
```
where `cruxVersion` is often defined in `gradle.properties` with

```
cruxVersion=0.0.1
```

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