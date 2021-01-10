// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReinitAKSOpsContainerServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReinitAKSOpsContainerServiceResponseBody body;

    public static ReinitAKSOpsContainerServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReinitAKSOpsContainerServiceResponse self = new ReinitAKSOpsContainerServiceResponse();
        return TeaModel.build(map, self);
    }

    public ReinitAKSOpsContainerServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReinitAKSOpsContainerServiceResponse setBody(ReinitAKSOpsContainerServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReinitAKSOpsContainerServiceResponseBody getBody() {
        return this.body;
    }

}
