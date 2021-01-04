// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateQuotaApplicationResponse setBody(CreateQuotaApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQuotaApplicationResponseBody getBody() {
        return this.body;
    }

}
