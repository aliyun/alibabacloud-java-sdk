// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllRegionsResponseBody body;

    public static GetAllRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllRegionsResponse self = new GetAllRegionsResponse();
        return TeaModel.build(map, self);
    }

    public GetAllRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllRegionsResponse setBody(GetAllRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllRegionsResponseBody getBody() {
        return this.body;
    }

}
