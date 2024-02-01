// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConvertBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertBandwidthPackageResponseBody body;

    public static ConvertBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertBandwidthPackageResponse self = new ConvertBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public ConvertBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertBandwidthPackageResponse setBody(ConvertBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
