// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class TransformEipSegmentToPublicIpAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransformEipSegmentToPublicIpAddressPoolResponseBody body;

    public static TransformEipSegmentToPublicIpAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        TransformEipSegmentToPublicIpAddressPoolResponse self = new TransformEipSegmentToPublicIpAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public TransformEipSegmentToPublicIpAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransformEipSegmentToPublicIpAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransformEipSegmentToPublicIpAddressPoolResponse setBody(TransformEipSegmentToPublicIpAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformEipSegmentToPublicIpAddressPoolResponseBody getBody() {
        return this.body;
    }

}
