// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class StartApproveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartApproveResponseBody body;

    public static StartApproveResponse build(java.util.Map<String, ?> map) throws Exception {
        StartApproveResponse self = new StartApproveResponse();
        return TeaModel.build(map, self);
    }

    public StartApproveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartApproveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartApproveResponse setBody(StartApproveResponseBody body) {
        this.body = body;
        return this;
    }
    public StartApproveResponseBody getBody() {
        return this.body;
    }

}
