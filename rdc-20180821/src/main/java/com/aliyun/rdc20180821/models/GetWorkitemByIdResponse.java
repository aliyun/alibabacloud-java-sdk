// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetWorkitemByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWorkitemByIdResponseBody body;

    public static GetWorkitemByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemByIdResponse self = new GetWorkitemByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkitemByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkitemByIdResponse setBody(GetWorkitemByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkitemByIdResponseBody getBody() {
        return this.body;
    }

}
