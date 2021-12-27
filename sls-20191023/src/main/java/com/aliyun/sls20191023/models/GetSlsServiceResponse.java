// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class GetSlsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSlsServiceResponseBody body;

    public static GetSlsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSlsServiceResponse self = new GetSlsServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetSlsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSlsServiceResponse setBody(GetSlsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSlsServiceResponseBody getBody() {
        return this.body;
    }

}
