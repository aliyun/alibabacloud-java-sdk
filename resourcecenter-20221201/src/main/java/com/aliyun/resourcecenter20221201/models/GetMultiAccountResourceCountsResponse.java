// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountResourceCountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultiAccountResourceCountsResponseBody body;

    public static GetMultiAccountResourceCountsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountResourceCountsResponse self = new GetMultiAccountResourceCountsResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountResourceCountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiAccountResourceCountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultiAccountResourceCountsResponse setBody(GetMultiAccountResourceCountsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiAccountResourceCountsResponseBody getBody() {
        return this.body;
    }

}
