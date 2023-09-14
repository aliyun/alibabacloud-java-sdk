// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationsForTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateQuotaApplicationsForTemplateResponseBody body;

    public static CreateQuotaApplicationsForTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaApplicationsForTemplateResponse self = new CreateQuotaApplicationsForTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateQuotaApplicationsForTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQuotaApplicationsForTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQuotaApplicationsForTemplateResponse setBody(CreateQuotaApplicationsForTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQuotaApplicationsForTemplateResponseBody getBody() {
        return this.body;
    }

}
