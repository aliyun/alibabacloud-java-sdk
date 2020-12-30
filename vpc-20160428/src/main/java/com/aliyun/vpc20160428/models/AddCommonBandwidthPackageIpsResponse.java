// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddCommonBandwidthPackageIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCommonBandwidthPackageIpsResponseBody body;

    public static AddCommonBandwidthPackageIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCommonBandwidthPackageIpsResponse self = new AddCommonBandwidthPackageIpsResponse();
        return TeaModel.build(map, self);
    }

    public AddCommonBandwidthPackageIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCommonBandwidthPackageIpsResponse setBody(AddCommonBandwidthPackageIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCommonBandwidthPackageIpsResponseBody getBody() {
        return this.body;
    }

}
