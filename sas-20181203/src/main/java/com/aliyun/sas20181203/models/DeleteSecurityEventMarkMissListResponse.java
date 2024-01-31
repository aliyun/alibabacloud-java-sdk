// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSecurityEventMarkMissListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityEventMarkMissListResponseBody body;

    public static DeleteSecurityEventMarkMissListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityEventMarkMissListResponse self = new DeleteSecurityEventMarkMissListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityEventMarkMissListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityEventMarkMissListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityEventMarkMissListResponse setBody(DeleteSecurityEventMarkMissListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityEventMarkMissListResponseBody getBody() {
        return this.body;
    }

}
