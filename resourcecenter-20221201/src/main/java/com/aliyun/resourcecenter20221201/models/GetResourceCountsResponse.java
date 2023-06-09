// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceCountsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceCountsResponseBody body;

    public static GetResourceCountsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceCountsResponse self = new GetResourceCountsResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceCountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceCountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceCountsResponse setBody(GetResourceCountsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceCountsResponseBody getBody() {
        return this.body;
    }

}
