// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class GetResourceGroupInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceGroupInstanceResponseBody body;

    public static GetResourceGroupInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupInstanceResponse self = new GetResourceGroupInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceGroupInstanceResponse setBody(GetResourceGroupInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceGroupInstanceResponseBody getBody() {
        return this.body;
    }

}
