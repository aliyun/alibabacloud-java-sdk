// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CheckAppResourcePermissionsBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAppResourcePermissionsBatchResponseBody body;

    public static CheckAppResourcePermissionsBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAppResourcePermissionsBatchResponse self = new CheckAppResourcePermissionsBatchResponse();
        return TeaModel.build(map, self);
    }

    public CheckAppResourcePermissionsBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAppResourcePermissionsBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAppResourcePermissionsBatchResponse setBody(CheckAppResourcePermissionsBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAppResourcePermissionsBatchResponseBody getBody() {
        return this.body;
    }

}
