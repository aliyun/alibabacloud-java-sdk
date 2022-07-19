// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsConfigResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsConfigResourcesResponseBody body;

    public static GetMsConfigResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsConfigResourcesResponse self = new GetMsConfigResourcesResponse();
        return TeaModel.build(map, self);
    }

    public GetMsConfigResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsConfigResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMsConfigResourcesResponse setBody(GetMsConfigResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsConfigResourcesResponseBody getBody() {
        return this.body;
    }

}
