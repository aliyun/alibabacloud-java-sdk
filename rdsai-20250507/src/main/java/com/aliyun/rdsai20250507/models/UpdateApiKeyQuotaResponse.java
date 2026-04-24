// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateApiKeyQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApiKeyQuotaResponseBody body;

    public static UpdateApiKeyQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyQuotaResponse self = new UpdateApiKeyQuotaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApiKeyQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApiKeyQuotaResponse setBody(UpdateApiKeyQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApiKeyQuotaResponseBody getBody() {
        return this.body;
    }

}
