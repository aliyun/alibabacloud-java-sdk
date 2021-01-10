// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSContainerservicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSContainerservicesResponseBody body;

    public static GetAKSContainerservicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSContainerservicesResponse self = new GetAKSContainerservicesResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSContainerservicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSContainerservicesResponse setBody(GetAKSContainerservicesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSContainerservicesResponseBody getBody() {
        return this.body;
    }

}
