// Educational recipe. Source: https://help.sap.com/docs/integration-suite/sap-integration-suite/read-and-modify-message-header-message-body-and-exchange-properties?locale=sk-SK&version=CLOUD
// Classic Message API; verify script-step/runtime compatibility before use.
import com.sap.gateway.ip.core.customdev.util.Message

Message processData(Message message) {
    String body = message.getBody(String)
    message.setBody('Processed: ' + (body ?: ''))
    return message
}

