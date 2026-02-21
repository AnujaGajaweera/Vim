# Metadata Specification

`metadata.json` is mandatory for every `.mcshader` archive.

## Required Fields

- `name`: string
- `author`: string
- `description`: string
- `version`: string
- `supportedMinecraftVersion`: string
- `modules`: object

## Optional Fields

- `icon`: string (path inside archive)
- `descriptorLayout`: array
- `renderPass`: object

## modules

Allowed module keys:

- `vertex`
- `fragment`
- `compute` (required)
- `geometry`

Each module object:

- `path`: string, required
- `entryPoint`: string, optional (`main` default)

## renderPass

- `colorAttachments`: integer in `[1, 8]`
- `depthAttachment`: boolean

Missing required fields or invalid types cause pack rejection with logged diagnostics.
