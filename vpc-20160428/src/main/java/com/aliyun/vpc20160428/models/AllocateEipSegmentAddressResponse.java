// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipSegmentAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateEipSegmentAddressResponseBody body;

    public static AllocateEipSegmentAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipSegmentAddressResponse self = new AllocateEipSegmentAddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocateEipSegmentAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateEipSegmentAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateEipSegmentAddressResponse setBody(AllocateEipSegmentAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateEipSegmentAddressResponseBody getBody() {
        return this.body;
    }

}
