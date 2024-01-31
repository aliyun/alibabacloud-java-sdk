// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateQuotaApplicationResponseBody body;

    public static CreateQuotaApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaApplicationResponse self = new CreateQuotaApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateQuotaApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQuotaApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQuotaApplicationResponse setBody(CreateQuotaApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQuotaApplicationResponseBody getBody() {
        return this.body;
    }

}
