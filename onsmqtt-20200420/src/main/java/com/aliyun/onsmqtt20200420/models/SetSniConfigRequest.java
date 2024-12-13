// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class SetSniConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DefaultCertificate")
    public String defaultCertificate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

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
