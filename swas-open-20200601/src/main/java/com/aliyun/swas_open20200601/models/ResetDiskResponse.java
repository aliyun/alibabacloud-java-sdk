// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ResetDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetDiskResponseBody body;

    public static ResetDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDiskResponse self = new ResetDiskResponse();
        return TeaModel.build(map, self);
    }

    public ResetDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetDiskResponse setBody(ResetDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDiskResponseBody getBody() {
        return this.body;
    }

}
