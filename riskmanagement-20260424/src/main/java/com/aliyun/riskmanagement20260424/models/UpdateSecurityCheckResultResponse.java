// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class UpdateSecurityCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSecurityCheckResultResponseBody body;

    public static UpdateSecurityCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityCheckResultResponse self = new UpdateSecurityCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecurityCheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSecurityCheckResultResponse setBody(UpdateSecurityCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecurityCheckResultResponseBody getBody() {
        return this.body;
    }

}
