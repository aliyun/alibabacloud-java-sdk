// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParametersByPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetParametersByPathResponseBody body;

    public static GetParametersByPathResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParametersByPathResponse self = new GetParametersByPathResponse();
        return TeaModel.build(map, self);
    }

    public GetParametersByPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParametersByPathResponse setBody(GetParametersByPathResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParametersByPathResponseBody getBody() {
        return this.body;
    }

}
