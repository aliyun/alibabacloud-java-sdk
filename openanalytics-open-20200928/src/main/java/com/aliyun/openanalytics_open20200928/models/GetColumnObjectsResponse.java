// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetColumnObjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetColumnObjectsResponseBody body;

    public static GetColumnObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetColumnObjectsResponse self = new GetColumnObjectsResponse();
        return TeaModel.build(map, self);
    }

    public GetColumnObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetColumnObjectsResponse setBody(GetColumnObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetColumnObjectsResponseBody getBody() {
        return this.body;
    }

}
