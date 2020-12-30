// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllAppVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllAppVersionsResponseBody body;

    public static GetAllAppVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllAppVersionsResponse self = new GetAllAppVersionsResponse();
        return TeaModel.build(map, self);
    }

    public GetAllAppVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllAppVersionsResponse setBody(GetAllAppVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllAppVersionsResponseBody getBody() {
        return this.body;
    }

}
