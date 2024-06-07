// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GenerateTrafficControlTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateTrafficControlTaskConfigResponseBody body;

    public static GenerateTrafficControlTaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateTrafficControlTaskConfigResponse self = new GenerateTrafficControlTaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public GenerateTrafficControlTaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateTrafficControlTaskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateTrafficControlTaskConfigResponse setBody(GenerateTrafficControlTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateTrafficControlTaskConfigResponseBody getBody() {
        return this.body;
    }

}
