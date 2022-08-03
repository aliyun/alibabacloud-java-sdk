// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class PromoteResourceAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PromoteResourceAccountResponseBody body;

    public static PromoteResourceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        PromoteResourceAccountResponse self = new PromoteResourceAccountResponse();
        return TeaModel.build(map, self);
    }

    public PromoteResourceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PromoteResourceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PromoteResourceAccountResponse setBody(PromoteResourceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public PromoteResourceAccountResponseBody getBody() {
        return this.body;
    }

}
