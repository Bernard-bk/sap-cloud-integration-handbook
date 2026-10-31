# Fundamentals

## Integration flow

An iFlow defines participants, adapter connections and message-processing steps. The editor models how a message moves through the tenant. Integration packages organize design content; deployment makes the flow available to its selected runtime.

Sources: [Elements of an Integration Flow](https://help.sap.com/docs/integration-suite/isuite-integrations-and-apis/elements-of-integration-flow?state=PRODUCTION), [First iFlow tutorial](https://developers.sap.com/tutorials/cp-starter-integration-cpi-design-iflow?from=sap-integration-suite-1).

## Message containers

| Container | Role |
| --- | --- |
| Body | The message content |
| Header | Message metadata that can participate in outbound communication |
| Exchange property | Processing state retained inside the integration flow |

Content Modifier can set body, headers and exchange properties. Review outbound headers instead of placing internal state or large values in them. Adapter settings affect what is propagated.

Source: [Define Content Modifier](https://help.sap.com/docs/cloud-integration/sap-cloud-integration/define-content-modifier?q=logging).

## Configuration and component versions

The component configuration documentation covers dynamic parameters, externalized parameters, component versions, transactions, validators, security-related steps and extensions of standard integration content. Treat the current runtime profile and component version as part of a flow's configuration.

Source: [Configure Integration Flow Components](https://help.sap.com/docs/integration-suite/sap-integration-suite/configure-integration-flow-components?q=using+data+storage+features).

## Learning sequence

Model the message path, configure the connection, inspect message containers, choose standard processing steps, then add code only where needed. Continue with [processing](PROCESSING.md), [adapters](ADAPTERS.md) and [operations](OPERATIONS.md).

