// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateTemplateQuotaItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTemplateQuotaItemResponseBody body;

    public static CreateTemplateQuotaItemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateQuotaItemResponse self = new CreateTemplateQuotaItemResponse();
        return TeaModel.build(map, self);
    }

    public CreateTemplateQuotaItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTemplateQuotaItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTemplateQuotaItemResponse setBody(CreateTemplateQuotaItemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTemplateQuotaItemResponseBody getBody() {
        return this.body;
    }

}
