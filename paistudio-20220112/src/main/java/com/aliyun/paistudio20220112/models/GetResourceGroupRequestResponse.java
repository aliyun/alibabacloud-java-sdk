// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceGroupRequestResponseBody body;

    public static GetResourceGroupRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupRequestResponse self = new GetResourceGroupRequestResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceGroupRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceGroupRequestResponse setBody(GetResourceGroupRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceGroupRequestResponseBody getBody() {
        return this.body;
    }

}
