// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateCommonBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCommonBandwidthPackageResponseBody body;

    public static CreateCommonBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCommonBandwidthPackageResponse self = new CreateCommonBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateCommonBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCommonBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCommonBandwidthPackageResponse setBody(CreateCommonBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCommonBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
