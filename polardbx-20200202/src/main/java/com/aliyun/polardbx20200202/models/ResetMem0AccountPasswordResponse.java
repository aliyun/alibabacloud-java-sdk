// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ResetMem0AccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetMem0AccountPasswordResponseBody body;

    public static ResetMem0AccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetMem0AccountPasswordResponse self = new ResetMem0AccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetMem0AccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetMem0AccountPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetMem0AccountPasswordResponse setBody(ResetMem0AccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetMem0AccountPasswordResponseBody getBody() {
        return this.body;
    }

}
