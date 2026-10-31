# Groovy recipes: documented APIs

All files use the classic `com.sap.gateway.ip.core.customdev.util.Message` import. Add a file as an iFlow script resource, select it in the compatible Groovy Script step and leave the function as processData.

The recipes are original minimal illustrations of SAP APIs. Names beginning Demo are educational placeholders, not SAP configuration fields. They were not deployed or executed on an SAP tenant.

| File | Input | Effect |
| --- | --- | --- |
| ReadHeadersAndProperties.groovy | DemoHeader, DemoProperty | Copies values into DemoReadHeader and DemoReadProperty properties |
| SetHeadersAndProperties.groovy | None | Sets DemoHeader and DemoProperty |
| ReadAndReplaceBody.groovy | Text body | Wraps it in a prefix; changes the body |
| ReadBodySize.groovy | Any supported body | Stores the reported body size |
| LogPayloadAttachment.groovy | EnablePayloadLog=true; text body | Adds body to MPL only when explicitly enabled |
| LogSafeContext.groovy | DemoContext property | Writes a selected context string to MPL |

## Headers, properties and body

Read values with getHeader/getProperty/getBody; write with setHeader/setProperty/setBody. The body-size example calls getBodySize. Converting a payload into a String can add memory overhead, so avoid unnecessary conversions.

Source: [Read and Modify Message Header, Message Body, and Exchange Properties](https://help.sap.com/docs/integration-suite/sap-integration-suite/read-and-modify-message-header-message-body-and-exchange-properties?locale=sk-SK&version=CLOUD).

## Logging

The attachment recipe uses getMessageLog and addAttachmentAsString. It does not add an outbound message attachment. The context recipe uses setStringProperty, which adds MPL information rather than an exchange property.

Source: [Add Information to the Message Processing Log](https://help.sap.com/docs/integration-suite/sap-integration-suite/add-information-to-message-processing-log?locale=sk-SK&version=CLOUD).

## Suggested verification

These are unexecuted checks:
1. Run SetHeadersAndProperties then ReadHeadersAndProperties; inspect the resulting properties.
2. Send a small text body through ReadAndReplaceBody; verify the new body.
3. Leave EnablePayloadLog unset: no payload attachment should be created.
4. With controlled test data, set EnablePayloadLog to true; check the MPL attachment.
5. Confirm the logging steps preserve the message body.
6. Recheck runtime imports and all results after a script upgrade.

Do not enable the payload recipe with confidential or credential-bearing messages.

