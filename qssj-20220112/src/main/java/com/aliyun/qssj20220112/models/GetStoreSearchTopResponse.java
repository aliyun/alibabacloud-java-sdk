// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStoreSearchTopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetStoreSearchTopResponseBody body;

    public static GetStoreSearchTopResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStoreSearchTopResponse self = new GetStoreSearchTopResponse();
        return TeaModel.build(map, self);
    }

    public GetStoreSearchTopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStoreSearchTopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStoreSearchTopResponse setBody(GetStoreSearchTopResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStoreSearchTopResponseBody getBody() {
        return this.body;
    }

}
