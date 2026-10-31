# Adapter guide

A sender adapter receives messages into a flow; a receiver adapter sends to a connected system. Support for either direction is adapter-specific. Check the exact adapter page and version before configuring it.

## Main families to look up

| Adapter / family | Purpose |
| --- | --- |
| HTTPS sender | Incoming HTTPS |
| HTTP receiver | Outbound HTTP(S) |
| SOAP | SOAP services |
| XI | XI messaging |
| IDoc | IDoc exchange |
| RFC | RFC connectivity |
| OData | OData services |
| SFTP | SSH file transfer |
| FTP | FTP file transfer |
| Mail | Email exchange |
| JMS | Tenant message queues |
| AMQP | AMQP messaging |
| ProcessDirect | Communication between integration flows |
| JDBC | Database access |
| AS2 | AS2 B2B messaging |
| AS4 | AS4 B2B messaging |
| SuccessFactors | SuccessFactors connectivity |
| SAP Ariba | Ariba connectivity |
| Salesforce | Salesforce connectivity |

This table is a navigation aid, not a direction/version support matrix or a complete adapter catalog.

Sources: [Connectivity Options](https://help.sap.com/docs/integration-suite/sap-integration-suite/connectivity-options?q=Cloud+Integration), [Configure Adapter in Communication Channels](https://help.sap.com/docs/cloud-integration/sap-cloud-integration/configure-adapter-in-communication-channels?locale=en-US&q=soap).

## What to verify in each adapter page

Read the sender and receiver documentation independently: connection settings, authentication options, payload handling, polling where relevant, delivery behavior and limitations. Do not infer equivalent behavior from a matching PI/PO adapter name.

For migration-specific differences, use [the SAP tooling limitations](https://help.sap.com/docs/integration-suite/sap-integration-suite/known-limitations), rather than this introductory catalog.


## SFTP sender: polling is an outbound connection

The tenant connects to the remote SFTP server and reads files; the data enters the flow even though the connection is initiated by the tenant. SFTP does not connect to FTP servers. Review polling, authentication, worker-node behavior and post-processing in the adapter reference. SAP also documents authentication backoff, so an authentication problem can affect subsequent polling attempts.

Source: [Configure the SFTP Sender Adapter](https://help.sap.com/docs/cloud-integration/sap-cloud-integration/configure-sftp-sender-adapter).

## HTTP receiver: consider the whole timeout chain

The effective timeout is affected by intermediary components, not only the receiver-adapter setting. A shorter idle timeout elsewhere can close a connection first. Review the configured failure handling separately from network, handshake and timeout failures.

Source: [HTTP Receiver Adapter](https://help.sap.com/docs/integration-suite/sap-integration-suite/http-receiver-adapter?q=Create+an+API+Using+the+API+Designer&version=CLOUD).

## ProcessDirect: synchronous flow-to-flow reuse

SAP documents ProcessDirect as a way to connect integration flows synchronously. Use this topic when deciding how to share processing between flows, and do not substitute its semantics for durable asynchronous messaging.

Source: [Communication Between Integration Flows](https://help.sap.com/docs/integration-suite/isuite-integrations-and-apis/communication-between-integration-flows?locale=de-DE&state=PRODUCTION&version=CLOUD).
