// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ReleaseEipSegmentAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ReleaseEipSegmentAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseEipSegmentAddressResponse setBody(ReleaseEipSegmentAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseEipSegmentAddressResponseBody getBody() {
        return this.body;
    }

}
