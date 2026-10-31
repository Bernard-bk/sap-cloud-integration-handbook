# Design quality and content lifecycle

## Transport

SAP documents CTS+, Cloud Transport Management, MTAR download and manual export/import as transport options. Select the supported mechanism for the actual environment.

For Cloud Transport Management, configure transport mode, destinations, routes and the required transport permission before triggering a package/artifact transport.

Sources: [Content Transport](https://help.sap.com/docs/SAP_INTEGRATION_SUITE/sap-integration-suite/content-transport), [Content Transport Using Cloud Transport Management](https://help.sap.com/docs/integration-suite/isuite-integrations-and-apis/content-transport-using-cloud-transport-management).

## Design review

Enable applicable design guidelines, inspect the report and align guideline configuration between tenants. Review the individual rules rather than treating a report as an automatic business acceptance test.

Source: [Design Guidelines](https://help.sap.com/docs/integration-suite/isuite-integrations-and-apis/design-guidelines).

## Groovy runtime upgrades

SAP documents script upgrading separately from general iFlow design. Follow the upgrade procedure and check incompatible libraries. Do not assume that replacing one import fully validates a runtime migration.

Sources: [Upgrading Script](https://help.sap.com/docs/integration-suite/sap-integration-suite/upgrading-and-downgrading-scripts?locale=nl-NL&version=CLOUD), [Scripts](https://help.sap.com/docs/cloud-integration/sap-cloud-integration/groovy-script?locale=en-US).

The recipes here deliberately use the classic Message API found in SAP's cited API examples. They require runtime compatibility review before use in another script-step version.

