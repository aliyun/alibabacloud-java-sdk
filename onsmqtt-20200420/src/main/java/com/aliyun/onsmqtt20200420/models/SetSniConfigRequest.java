// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class SetSniConfigRequest extends TeaModel {
    /**
     * <p>The default certificate. If the domain name that you access cannot match the certificates of the broker, the default certificate is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1533xxxx-cn-hangzhou</p>
     */
    @NameInMap("DefaultCertificate")
    public String defaultCertificate;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-5yd3xxx</p>
     */
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    /**
     * <p>The Server Name Indication (SNI) configuration. This parameter is used to map domain names and certificates. Format: Domain name#Certificate ID#Password (if available);Domain name#Certificate ID#Password (if available).</p>
     * 
     * <strong>example:</strong>
     * <p>*.mqtt.aliyuncs.com#15xxxxx-cn-hangzhou;mqtt-test.mqtt.aliyuncs.com#15xxxx9-cn-hangzhou</p>
     */
    @NameInMap("SniConfig")
    public String sniConfig;

    public static SetSniConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSniConfigRequest self = new SetSniConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetSniConfigRequest setDefaultCertificate(String defaultCertificate) {
        this.defaultCertificate = defaultCertificate;
        return this;
    }
    public String getDefaultCertificate() {
        return this.defaultCertificate;
    }

    public SetSniConfigRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public SetSniConfigRequest setSniConfig(String sniConfig) {
        this.sniConfig = sniConfig;
        return this;
    }
    public String getSniConfig() {
        return this.sniConfig;
    }

}
