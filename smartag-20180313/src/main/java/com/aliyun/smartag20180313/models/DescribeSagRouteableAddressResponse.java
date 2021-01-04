// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRouteableAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagRouteableAddressResponseBody body;

    public static DescribeSagRouteableAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagRouteableAddressResponse self = new DescribeSagRouteableAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagRouteableAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagRouteableAddressResponse setBody(DescribeSagRouteableAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagRouteableAddressResponseBody getBody() {
        return this.body;
    }

}
