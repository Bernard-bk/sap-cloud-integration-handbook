// Educational recipe. Source: https://help.sap.com/docs/integration-suite/sap-integration-suite/read-and-modify-message-header-message-body-and-exchange-properties?locale=sk-SK&version=CLOUD
// Classic Message API; verify script-step/runtime compatibility before use.
import com.sap.gateway.ip.core.customdev.util.Message

Message processData(Message message) {
    String header = message.getHeader('DemoHeader', String)
    Object property = message.getProperty('DemoProperty')
    message.setProperty('DemoReadHeader', header ?: '')
    message.setProperty('DemoReadProperty', property == null ? '' : property)
    return message
}

