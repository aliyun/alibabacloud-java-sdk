// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StopTrafficControlTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopTrafficControlTargetResponseBody body;

    public static StopTrafficControlTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTrafficControlTargetResponse self = new StopTrafficControlTargetResponse();
        return TeaModel.build(map, self);
    }

    public StopTrafficControlTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTrafficControlTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTrafficControlTargetResponse setBody(StopTrafficControlTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTrafficControlTargetResponseBody getBody() {
        return this.body;
    }

}
