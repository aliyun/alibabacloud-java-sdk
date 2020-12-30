// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandOfferOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BandOfferOrderResponseBody body;

    public static BandOfferOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        BandOfferOrderResponse self = new BandOfferOrderResponse();
        return TeaModel.build(map, self);
    }

    public BandOfferOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BandOfferOrderResponse setBody(BandOfferOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public BandOfferOrderResponseBody getBody() {
        return this.body;
    }

}
