// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ModifyTemplateQuotaItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTemplateQuotaItemResponseBody body;

    public static ModifyTemplateQuotaItemResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateQuotaItemResponse self = new ModifyTemplateQuotaItemResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateQuotaItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTemplateQuotaItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTemplateQuotaItemResponse setBody(ModifyTemplateQuotaItemResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTemplateQuotaItemResponseBody getBody() {
        return this.body;
    }

}
