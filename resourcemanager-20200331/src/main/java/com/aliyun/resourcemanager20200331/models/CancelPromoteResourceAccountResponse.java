// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CancelPromoteResourceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelPromoteResourceAccountResponseBody body;

    public static CancelPromoteResourceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPromoteResourceAccountResponse self = new CancelPromoteResourceAccountResponse();
        return TeaModel.build(map, self);
    }

    public CancelPromoteResourceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelPromoteResourceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelPromoteResourceAccountResponse setBody(CancelPromoteResourceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelPromoteResourceAccountResponseBody getBody() {
        return this.body;
    }

}
