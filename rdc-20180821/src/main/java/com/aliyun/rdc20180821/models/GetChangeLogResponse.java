// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetChangeLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetChangeLogResponseBody body;

    public static GetChangeLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChangeLogResponse self = new GetChangeLogResponse();
        return TeaModel.build(map, self);
    }

    public GetChangeLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChangeLogResponse setBody(GetChangeLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChangeLogResponseBody getBody() {
        return this.body;
    }

}
