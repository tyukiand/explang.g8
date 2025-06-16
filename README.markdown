# Language Experiments Boilerplate Generator

[Giter8][g8] template for small programming-language related experiments.

Includes some batteries:

  * `cats`
  * `cats-mtl`
  * `cats-effect`
  * `scala-parser-combinators`
  * `fastparse` (pick either)
  * `scalacheck`
  * `munit`

Usage
-----

Note that this template does not require a manually created
project directory, it will create the project-root directory
on its own:

```scala
sbt new tyukiand/explang.g8
# Change the project name / package name
# click "Enter" when presented with a list of links to the dependency versions.
# click "Enter" couple of times or update the versions.
cd name-of-the-project   # this is created automatically
sbt test                 # this should build and run the tests
```

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

