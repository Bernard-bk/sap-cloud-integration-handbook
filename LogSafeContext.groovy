// Educational recipe. Source: https://help.sap.com/docs/integration-suite/sap-integration-suite/add-information-to-message-processing-log?locale=sk-SK&version=CLOUD
// Classic Message API; verify script-step/runtime compatibility before use.
import com.sap.gateway.ip.core.customdev.util.Message

Message processData(Message message) {
    // Only pass approved, non-sensitive context; no automatic redaction.
    Object context = message.getProperty('DemoContext')
    if (context != null) {
        def mpl = messageLogFactory.getMessageLog(message)
        if (mpl != null) mpl.setStringProperty('DemoContext', context.toString())
    }
    return message
}

