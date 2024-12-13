// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetRegisterCodeRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for MQTT instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2d******</p>
     */
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    public static GetRegisterCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegisterCodeRequest self = new GetRegisterCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetRegisterCodeRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

}
