// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ObtainMqConsoleLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MqConsoleLinkResult body;

    public static ObtainMqConsoleLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        ObtainMqConsoleLinkResponse self = new ObtainMqConsoleLinkResponse();
        return TeaModel.build(map, self);
    }

    public ObtainMqConsoleLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ObtainMqConsoleLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ObtainMqConsoleLinkResponse setBody(MqConsoleLinkResult body) {
        this.body = body;
        return this;
    }
    public MqConsoleLinkResult getBody() {
        return this.body;
    }

}
