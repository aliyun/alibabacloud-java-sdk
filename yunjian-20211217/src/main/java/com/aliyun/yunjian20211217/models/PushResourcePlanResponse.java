// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class PushResourcePlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushResourcePlanResponseBody body;

    public static PushResourcePlanResponse build(java.util.Map<String, ?> map) throws Exception {
        PushResourcePlanResponse self = new PushResourcePlanResponse();
        return TeaModel.build(map, self);
    }

    public PushResourcePlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushResourcePlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushResourcePlanResponse setBody(PushResourcePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public PushResourcePlanResponseBody getBody() {
        return this.body;
    }

}
