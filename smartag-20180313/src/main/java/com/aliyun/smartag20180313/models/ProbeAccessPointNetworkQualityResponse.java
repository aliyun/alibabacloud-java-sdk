// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ProbeAccessPointNetworkQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProbeAccessPointNetworkQualityResponseBody body;

    public static ProbeAccessPointNetworkQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        ProbeAccessPointNetworkQualityResponse self = new ProbeAccessPointNetworkQualityResponse();
        return TeaModel.build(map, self);
    }

    public ProbeAccessPointNetworkQualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProbeAccessPointNetworkQualityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProbeAccessPointNetworkQualityResponse setBody(ProbeAccessPointNetworkQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public ProbeAccessPointNetworkQualityResponseBody getBody() {
        return this.body;
    }

}
