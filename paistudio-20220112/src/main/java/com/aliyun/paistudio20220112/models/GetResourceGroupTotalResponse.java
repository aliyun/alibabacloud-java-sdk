// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupTotalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceGroupTotalResponseBody body;

    public static GetResourceGroupTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupTotalResponse self = new GetResourceGroupTotalResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupTotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceGroupTotalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceGroupTotalResponse setBody(GetResourceGroupTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceGroupTotalResponseBody getBody() {
        return this.body;
    }

}
