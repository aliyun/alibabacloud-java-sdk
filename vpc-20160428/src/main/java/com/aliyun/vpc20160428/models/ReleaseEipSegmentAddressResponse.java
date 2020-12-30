// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ReleaseEipSegmentAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseEipSegmentAddressResponseBody body;

    public static ReleaseEipSegmentAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseEipSegmentAddressResponse self = new ReleaseEipSegmentAddressResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseEipSegmentAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseEipSegmentAddressResponse setBody(ReleaseEipSegmentAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseEipSegmentAddressResponseBody getBody() {
        return this.body;
    }

}
