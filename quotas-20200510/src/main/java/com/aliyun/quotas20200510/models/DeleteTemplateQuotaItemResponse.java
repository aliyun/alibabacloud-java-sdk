// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class DeleteTemplateQuotaItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTemplateQuotaItemResponseBody body;

    public static DeleteTemplateQuotaItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateQuotaItemResponse self = new DeleteTemplateQuotaItemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateQuotaItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTemplateQuotaItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTemplateQuotaItemResponse setBody(DeleteTemplateQuotaItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTemplateQuotaItemResponseBody getBody() {
        return this.body;
    }

}
