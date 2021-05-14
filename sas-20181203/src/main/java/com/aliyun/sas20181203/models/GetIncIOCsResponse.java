// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetIncIOCsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIncIOCsResponseBody body;

    public static GetIncIOCsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIncIOCsResponse self = new GetIncIOCsResponse();
        return TeaModel.build(map, self);
    }

    public GetIncIOCsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIncIOCsResponse setBody(GetIncIOCsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIncIOCsResponseBody getBody() {
        return this.body;
    }

}
