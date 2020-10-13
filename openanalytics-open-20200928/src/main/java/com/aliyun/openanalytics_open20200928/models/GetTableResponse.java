// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTableResponseBody body;

    public static GetTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableResponse self = new GetTableResponse();
        return TeaModel.build(map, self);
    }

    public GetTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableResponse setBody(GetTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableResponseBody getBody() {
        return this.body;
    }

}
