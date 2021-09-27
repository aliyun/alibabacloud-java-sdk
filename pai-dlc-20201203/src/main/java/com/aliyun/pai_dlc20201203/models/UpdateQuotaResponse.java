// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateQuotaResponseBody body;

    public static UpdateQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaResponse self = new UpdateQuotaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQuotaResponse setBody(UpdateQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQuotaResponseBody getBody() {
        return this.body;
    }

}
