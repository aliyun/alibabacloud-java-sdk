// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetParametersResponseBody body;

    public static GetParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParametersResponse self = new GetParametersResponse();
        return TeaModel.build(map, self);
    }

    public GetParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParametersResponse setBody(GetParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParametersResponseBody getBody() {
        return this.body;
    }

}
