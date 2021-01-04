// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class SetSagRouteableAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetSagRouteableAddressResponseBody body;

    public static SetSagRouteableAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSagRouteableAddressResponse self = new SetSagRouteableAddressResponse();
        return TeaModel.build(map, self);
    }

    public SetSagRouteableAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSagRouteableAddressResponse setBody(SetSagRouteableAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSagRouteableAddressResponseBody getBody() {
        return this.body;
    }

}
