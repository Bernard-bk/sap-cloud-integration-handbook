// Educational recipe. Source: https://help.sap.com/docs/integration-suite/sap-integration-suite/add-information-to-message-processing-log?locale=sk-SK&version=CLOUD
// Classic Message API; verify script-step/runtime compatibility before use.
import com.sap.gateway.ip.core.customdev.util.Message

Message processData(Message message) {
    // Enable only for controlled test data. Default: disabled.
    boolean enabled = 'true'.equalsIgnoreCase(
        String.valueOf(message.getProperty('EnablePayloadLog')))
    if (enabled) {
        def mpl = messageLogFactory.getMessageLog(message)
        if (mpl != null) {
            String body = message.getBody(String)
            mpl.addAttachmentAsString('Test payload', body ?: '', 'text/plain')
        }
    }
    return message
}

