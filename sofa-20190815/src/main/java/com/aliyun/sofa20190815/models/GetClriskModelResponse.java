// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClriskModelResponseBody body;

    public static GetClriskModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClriskModelResponse self = new GetClriskModelResponse();
        return TeaModel.build(map, self);
    }

    public GetClriskModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClriskModelResponse setBody(GetClriskModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClriskModelResponseBody getBody() {
        return this.body;
    }

}
