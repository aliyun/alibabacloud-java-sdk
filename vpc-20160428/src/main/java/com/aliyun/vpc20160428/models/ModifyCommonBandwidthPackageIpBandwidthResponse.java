// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageIpBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCommonBandwidthPackageIpBandwidthResponseBody body;

    public static ModifyCommonBandwidthPackageIpBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageIpBandwidthResponse self = new ModifyCommonBandwidthPackageIpBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackageIpBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCommonBandwidthPackageIpBandwidthResponse setBody(ModifyCommonBandwidthPackageIpBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCommonBandwidthPackageIpBandwidthResponseBody getBody() {
        return this.body;
    }

}
