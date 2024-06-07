// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StartTrafficControlTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartTrafficControlTargetResponseBody body;

    public static StartTrafficControlTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTrafficControlTargetResponse self = new StartTrafficControlTargetResponse();
        return TeaModel.build(map, self);
    }

    public StartTrafficControlTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTrafficControlTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTrafficControlTargetResponse setBody(StartTrafficControlTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTrafficControlTargetResponseBody getBody() {
        return this.body;
    }

}
