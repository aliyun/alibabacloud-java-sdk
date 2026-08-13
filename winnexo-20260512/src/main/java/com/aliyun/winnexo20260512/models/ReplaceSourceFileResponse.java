// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceSourceFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplaceSourceFileResponseBody body;

    public static ReplaceSourceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceSourceFileResponse self = new ReplaceSourceFileResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceSourceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceSourceFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceSourceFileResponse setBody(ReplaceSourceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceSourceFileResponseBody getBody() {
        return this.body;
    }

}
