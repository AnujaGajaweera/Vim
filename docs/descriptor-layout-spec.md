# Descriptor Layout Specification

`descriptorLayout` is optional. If present, it must be an array of entries.

## Entry Fields

- `set`: integer, `>= 0`
- `binding`: integer, `>= 0`
- `type`: string
- `name`: string

## Validation Rules

- Negative values are rejected.
- Declared `set/binding` pairs must appear in SPIR-V decorations when layout is provided.
- Reflection is based on SPIR-V `OpDecorate` values for `DescriptorSet` and `Binding`.

Internal key derivation used during validation:

- `key = set * 1000 + binding`
