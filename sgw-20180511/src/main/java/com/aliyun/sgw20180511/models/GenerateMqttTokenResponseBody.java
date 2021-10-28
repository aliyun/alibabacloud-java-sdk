// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class GenerateMqttTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("MqttToken")
    public String mqttToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GenerateMqttTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateMqttTokenResponseBody self = new GenerateMqttTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateMqttTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateMqttTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateMqttTokenResponseBody setMqttToken(String mqttToken) {
        this.mqttToken = mqttToken;
        return this;
    }
    public String getMqttToken() {
        return this.mqttToken;
    }

    public GenerateMqttTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateMqttTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
