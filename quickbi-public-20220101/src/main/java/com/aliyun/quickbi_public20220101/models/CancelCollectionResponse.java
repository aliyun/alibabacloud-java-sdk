// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CancelCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelCollectionResponseBody body;

    public static CancelCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCollectionResponse self = new CancelCollectionResponse();
        return TeaModel.build(map, self);
    }

    public CancelCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelCollectionResponse setBody(CancelCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCollectionResponseBody getBody() {
        return this.body;
    }

}
