# SAP Cloud Integration Handbook
### CPI fundamentals, adapters, operations and Groovy recipes

Documentation-based notes by [Bernard Bieniek](https://www.linkedin.com/in/bernard-bieniek/).

**Scope:** a concise map of the main Cloud Integration documentation areas. It is not a complete mirror of SAP Help or a claim that every adapter and feature is covered. Other Integration Suite capabilities are outside the core scope.

**Technical sources:** SAP Help Portal and SAP Developer Center only. Summaries are independently written; code files are small educational recipes using SAP's documented APIs, not SAP-certified components.

**Reviewed:** 31 October 2026. **Runtime testing:** not performed on an SAP tenant.

## Contents

| Topic | Read |
| --- | --- |
| iFlows, lifecycle and message containers | [Fundamentals](FUNDAMENTALS.md) |
| Connectivity and adapter families | [Adapter guide](ADAPTERS.md) |
| Routing, mapping and reusable processing | [Processing map](PROCESSING.md) |
| Persistence, queues and runtime state | [Storage](STORAGE.md) |
| Errors, security and monitoring | [Operations](OPERATIONS.md) |
| Content transport and design quality | [Lifecycle](LIFECYCLE.md) |
| Script selection and usage | [Groovy recipes](GROOVY-RECIPES.md) |
| SAP documentation index | [Sources](SOURCES.md) |

## Groovy files

- ReadHeadersAndProperties.groovy
- SetHeadersAndProperties.groovy
- ReadAndReplaceBody.groovy
- LogPayloadAttachment.groovy
- LogSafeContext.groovy
- ReadBodySize.groovy

These illustrate recurring API tasks. SAP documentation does not rank the most frequently used scripts, so no frequency ranking is claimed.

## Practical starting point

Use SAP's [first iFlow tutorial](https://developers.sap.com/tutorials/cp-starter-integration-cpi-design-iflow?from=sap-integration-suite-1) for the actual tenant walkthrough. For a simple assignment, prefer a Content Modifier over custom code when it meets the requirement.

Related: [PI/PO migration notes](https://github.com/Bernard-bk/sap-pipo-to-integration-suite-migration) · [Order transformation portfolio](https://github.com/Bernard-bk/sap-integration-suite-groovy)

