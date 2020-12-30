// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConvertBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ConvertBandwidthPackageResponse setBody(ConvertBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
