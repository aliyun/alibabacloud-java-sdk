// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyPxfsTenantQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPxfsTenantQuotaResponseBody body;

    public static ModifyPxfsTenantQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPxfsTenantQuotaResponse self = new ModifyPxfsTenantQuotaResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPxfsTenantQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPxfsTenantQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPxfsTenantQuotaResponse setBody(ModifyPxfsTenantQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPxfsTenantQuotaResponseBody getBody() {
        return this.body;
    }

}
