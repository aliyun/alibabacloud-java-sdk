// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ResetInstancePasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetInstancePasswordResponseBody body;

    public static ResetInstancePasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetInstancePasswordResponse self = new ResetInstancePasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetInstancePasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetInstancePasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetInstancePasswordResponse setBody(ResetInstancePasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetInstancePasswordResponseBody getBody() {
        return this.body;
    }

}
