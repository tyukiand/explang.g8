[Giter8][g8] template for small programming language experiments

Automatically sets up some basics, such as

  * `cats`
  * `cats-mtl`
  * `cats-effect`
  * `scala-parser-combinators`
  * `antlr4` already set-up (remove one if you don't need both)
  * `scalacheck`

Template license
----------------

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <https://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: https://www.foundweekends.org/giter8/

Modifying the Template
----------------------

You probably primarily will want to look at files in `src/main/g8`:

  * `default.properties` - store the default versions and other settings
  * `build.sbt` - update dependencies, use `$variable-names$`

Sanity Checks
-------------

If you run

```shell
sbt test
```

then you can take a look around in `target/sbt-test/explang.g8/scripted`,
it will contain a generated example project.

