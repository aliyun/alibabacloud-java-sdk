// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ReleaseSasInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseSasInstanceResponseBody body;

    public static ReleaseSasInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseSasInstanceResponse self = new ReleaseSasInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseSasInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseSasInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseSasInstanceResponse setBody(ReleaseSasInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseSasInstanceResponseBody getBody() {
        return this.body;
    }

}
