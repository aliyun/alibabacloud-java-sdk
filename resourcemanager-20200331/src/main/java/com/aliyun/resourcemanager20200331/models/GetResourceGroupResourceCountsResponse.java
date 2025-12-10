// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceGroupResourceCountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceGroupResourceCountsResponseBody body;

    public static GetResourceGroupResourceCountsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupResourceCountsResponse self = new GetResourceGroupResourceCountsResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupResourceCountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceGroupResourceCountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceGroupResourceCountsResponse setBody(GetResourceGroupResourceCountsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceGroupResourceCountsResponseBody getBody() {
        return this.body;
    }

}
