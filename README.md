# EntryPointHiltSample

Currently Hilt is supporting only a few classes, which can be annotated with @AndroidEntryPoint.
Inside those classes we can do field injection of dependencies with @Inject annotation.

BThe classes which are not supported by hilt like content providers etc,
where we can still do field injection of dependencies with the help of @EntryPoint Annotation.
