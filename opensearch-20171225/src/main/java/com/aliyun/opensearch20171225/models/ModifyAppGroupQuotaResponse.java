// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppGroupQuotaResponseBody body;

    public static ModifyAppGroupQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppGroupQuotaResponse self = new ModifyAppGroupQuotaResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppGroupQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppGroupQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppGroupQuotaResponse setBody(ModifyAppGroupQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppGroupQuotaResponseBody getBody() {
        return this.body;
    }

}
