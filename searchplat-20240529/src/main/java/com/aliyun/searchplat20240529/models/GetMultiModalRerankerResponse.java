// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMultiModalRerankerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultiModalRerankerResponseBody body;

    public static GetMultiModalRerankerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiModalRerankerResponse self = new GetMultiModalRerankerResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiModalRerankerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiModalRerankerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultiModalRerankerResponse setBody(GetMultiModalRerankerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiModalRerankerResponseBody getBody() {
        return this.body;
    }

}
