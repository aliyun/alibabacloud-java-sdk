// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ActiveCaCertificateRequest extends TeaModel {
    /**
     * <p>CA证书所绑定的实例ID，即云消息队列 MQTT 版的实例ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2d******</p>
     */
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    /**
     * <p>待激活CA证书的SN序列号，用于唯一标识一个CA证书。</p>
     * <p>取值范围：不超过128 Byte。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>007269004887******</p>
     */
    @NameInMap("Sn")
    public String sn;

    public static ActiveCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveCaCertificateRequest self = new ActiveCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ActiveCaCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public ActiveCaCertificateRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
