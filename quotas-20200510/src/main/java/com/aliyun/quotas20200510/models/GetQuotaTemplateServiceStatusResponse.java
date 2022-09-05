// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaTemplateServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQuotaTemplateServiceStatusResponseBody body;

    public static GetQuotaTemplateServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaTemplateServiceStatusResponse self = new GetQuotaTemplateServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaTemplateServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaTemplateServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQuotaTemplateServiceStatusResponse setBody(GetQuotaTemplateServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaTemplateServiceStatusResponseBody getBody() {
        return this.body;
    }

}
