# Shader Format Specification

## Container

- Extension: `.mcshader`
- Physical format: ZIP archive
- Scan directory: `<gameDir>/shaderpacks/`
- `.zip` shader packs are ignored

## Required File

- `metadata.json`

## Shader Modules

Declared under `metadata.modules`.

Supported keys:

- `vertex`
- `fragment`
- `compute` (required)
- `geometry` (optional)

Each module:

- `path` (required)
- `entryPoint` (optional, defaults to `main`)

## Validation

Vanadium rejects invalid packs safely (without client crash) when any of the following fail:

- SPIR-V magic number and binary length checks
- instruction stream shape checks
- expected entrypoint presence
- execution model/stage match
- descriptor decoration checks (`DescriptorSet`, `Binding`) when descriptor layout is declared
