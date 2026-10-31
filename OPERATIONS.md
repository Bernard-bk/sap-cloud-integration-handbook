# Errors, security and monitoring

## Message processing

Use the monitoring workspace to inspect message processing and deployed integration content. Its security sections expose security material, keystore and PGP-key administration; data-related sections cover stored data and queues where available.

Source: [Monitor Integrations](https://help.sap.com/docs/integration-suite/sap-integration-suite/monitor-integrations?locale=he-IL).

## Exception subprocesses

SAP distinguishes the end event used by an exception subprocess:
- End: custom handled response; Completed status.
- Error end: Failed status.
- Escalation end: Escalated status.

Choose the intended monitoring outcome as well as the caller-facing error behavior.

Source: [Handle Exceptions](https://help.sap.com/docs/integration-suite/sap-integration-suite/errors-handle-exceptions).

## MPL properties and attachments

Use messageLogFactory to access the MPL. The documented logging API can add properties and string attachments. An MPL attachment is monitoring content, not a business attachment sent to a receiver.

Source: [Add Information to the Message Processing Log](https://help.sap.com/docs/integration-suite/sap-integration-suite/add-information-to-message-processing-log?locale=sk-SK&version=CLOUD).

## Script safety

Use supported APIs; avoid relying on internal implementation classes. SAP's script guidelines caution against direct operating-system, filesystem and network access from scripts. Use the appropriate supported integration features instead.

Source: [Scripts — upgrade readiness guidelines](https://help.sap.com/docs/cloud-integration/sap-cloud-integration/groovy-script?locale=en-US).

Repository convention: payload logging is opt-in, and no credential or production payload belongs in this repository. The example attachment script is for controlled test data.

