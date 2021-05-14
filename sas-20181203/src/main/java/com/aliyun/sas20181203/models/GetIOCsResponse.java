// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetIOCsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIOCsResponseBody body;

    public static GetIOCsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIOCsResponse self = new GetIOCsResponse();
        return TeaModel.build(map, self);
    }

    public GetIOCsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIOCsResponse setBody(GetIOCsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIOCsResponseBody getBody() {
        return this.body;
    }

}
