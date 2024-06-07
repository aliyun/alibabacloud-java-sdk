// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class SplitTrafficControlTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SplitTrafficControlTargetResponseBody body;

    public static SplitTrafficControlTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        SplitTrafficControlTargetResponse self = new SplitTrafficControlTargetResponse();
        return TeaModel.build(map, self);
    }

    public SplitTrafficControlTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SplitTrafficControlTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SplitTrafficControlTargetResponse setBody(SplitTrafficControlTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public SplitTrafficControlTargetResponseBody getBody() {
        return this.body;
    }

}
