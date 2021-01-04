// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ClearSagRouteableAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClearSagRouteableAddressResponseBody body;

    public static ClearSagRouteableAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearSagRouteableAddressResponse self = new ClearSagRouteableAddressResponse();
        return TeaModel.build(map, self);
    }

    public ClearSagRouteableAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearSagRouteableAddressResponse setBody(ClearSagRouteableAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearSagRouteableAddressResponseBody getBody() {
        return this.body;
    }

}
