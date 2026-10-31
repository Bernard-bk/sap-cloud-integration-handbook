# Message processing: a documentation map

This page identifies the main topics to study rather than duplicating every configuration field.

| Topic | What to study |
| --- | --- |
| Content Modifier | Body, headers, exchange properties |
| Message mapping | Source/target structures, functions and mapping resources |
| XSLT mapping | XML transformation resources |
| Converters | Supported XML/JSON/CSV conversion settings |
| Router | Conditional message paths |
| Splitter | Dividing message content for processing |
| Multicast / Join / Gather | Branching and recombining results |
| Content Enricher | Enriching messages with additional content |
| Validator | Schema checks |
| Local integration process | Organizing reusable logic within a flow |
| Script / Script Collection | Custom logic and script reuse |
| Request Reply / Send | Interaction with receivers |
| Transaction handling | Supported transaction scope |
| Security steps | Signing, encryption and related configuration |
| Dynamic configuration | Runtime header/property references |

Start from [Configure Integration Flow Components](https://help.sap.com/docs/integration-suite/sap-integration-suite/configure-integration-flow-components?q=using+data+storage+features) and [the editor overview](https://help.sap.com/docs/integration-suite/sap-integration-suite/overview-of-integration-flow-editor?locale=en-US&state=PRODUCTION&version=CLOUD).

## Routing

SAP groups message-path decisions and splitting under routing. Select the appropriate routing step and review its detailed behavior, rather than treating router and splitter as interchangeable.

Source: [Define Routing Steps](https://help.sap.com/docs/integration-suite/sap-integration-suite/define-routing-steps).

## Patterns and reference content

SAP publishes guidelines and reference flows for enterprise integration patterns, including routing, enrichment and splitting. Study a reference flow with one focused purpose before composing a larger design.

Source: [Integration Flow Design Guidelines](https://help.sap.com/docs/cloud-integration/sap-cloud-integration/integration-flow-design-guidelines?q=SAP_ApplicationID&version=Cloud).

