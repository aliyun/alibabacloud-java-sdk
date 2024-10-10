// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetWorksEmbedListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorksEmbedListResponseBody body;

    public static GetWorksEmbedListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorksEmbedListResponse self = new GetWorksEmbedListResponse();
        return TeaModel.build(map, self);
    }

    public GetWorksEmbedListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorksEmbedListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorksEmbedListResponse setBody(GetWorksEmbedListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorksEmbedListResponseBody getBody() {
        return this.body;
    }

}
