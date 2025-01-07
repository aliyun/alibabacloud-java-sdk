// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitTenantCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTenantCheckResponseBody body;

    public static SubmitTenantCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTenantCheckResponse self = new SubmitTenantCheckResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTenantCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTenantCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTenantCheckResponse setBody(SubmitTenantCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTenantCheckResponseBody getBody() {
        return this.body;
    }

}
