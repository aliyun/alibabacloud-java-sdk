// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateTrafficControlTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTrafficControlTargetResponseBody body;

    public static CreateTrafficControlTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficControlTargetResponse self = new CreateTrafficControlTargetResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrafficControlTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrafficControlTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrafficControlTargetResponse setBody(CreateTrafficControlTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrafficControlTargetResponseBody getBody() {
        return this.body;
    }

}
