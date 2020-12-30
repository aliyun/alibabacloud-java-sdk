// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageInternetChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCommonBandwidthPackageInternetChargeTypeResponseBody body;

    public static ModifyCommonBandwidthPackageInternetChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageInternetChargeTypeResponse self = new ModifyCommonBandwidthPackageInternetChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackageInternetChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCommonBandwidthPackageInternetChargeTypeResponse setBody(ModifyCommonBandwidthPackageInternetChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCommonBandwidthPackageInternetChargeTypeResponseBody getBody() {
        return this.body;
    }

}
