// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class RebootECSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootECSResponseBody body;

    public static RebootECSResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootECSResponse self = new RebootECSResponse();
        return TeaModel.build(map, self);
    }

    public RebootECSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootECSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootECSResponse setBody(RebootECSResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootECSResponseBody getBody() {
        return this.body;
    }

}
