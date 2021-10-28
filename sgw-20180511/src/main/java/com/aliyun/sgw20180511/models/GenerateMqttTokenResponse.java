// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class GenerateMqttTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateMqttTokenResponseBody body;

    public static GenerateMqttTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateMqttTokenResponse self = new GenerateMqttTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateMqttTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateMqttTokenResponse setBody(GenerateMqttTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateMqttTokenResponseBody getBody() {
        return this.body;
    }

}
