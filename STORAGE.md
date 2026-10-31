# Storage and processing state

| Mechanism | Documented use |
| --- | --- |
| Exchange property | State across processing steps |
| Header | Message metadata, including communication beyond a step |
| Local/global Data Store | Stored data shared in the documented scope |
| Local/global variable | Small values across executions |
| JMS queue | Asynchronous decoupling and retry scenarios |
| Aggregator state | Temporary aggregation state |
| Persist / message store | Message content for later access |
| MPL attachment | Monitoring-related content after processing |
| Partner Directory | Runtime configuration for partner networks |

The Persist step is not a general-purpose data store for subsequent flow steps. Aggregation state is not permanent storage. Exchange properties are not durable cross-execution state.

Source: [Using Data Storage Features When Designing Integration Flows](https://help.sap.com/docs/integration-suite/isuite-integrations-and-apis/using-data-storage-features-when-designing-integration-flows).

Review the relevant feature's scope, quotas, lifecycle and access method before choosing storage. This page makes no universal retention or capacity claims.

