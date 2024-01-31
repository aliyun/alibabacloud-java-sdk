// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ModifyQuotaTemplateServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyQuotaTemplateServiceStatusResponseBody body;

    public static ModifyQuotaTemplateServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyQuotaTemplateServiceStatusResponse self = new ModifyQuotaTemplateServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyQuotaTemplateServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyQuotaTemplateServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyQuotaTemplateServiceStatusResponse setBody(ModifyQuotaTemplateServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyQuotaTemplateServiceStatusResponseBody getBody() {
        return this.body;
    }

}
