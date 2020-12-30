// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackagePayTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCommonBandwidthPackagePayTypeResponseBody body;

    public static ModifyCommonBandwidthPackagePayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackagePayTypeResponse self = new ModifyCommonBandwidthPackagePayTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackagePayTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCommonBandwidthPackagePayTypeResponse setBody(ModifyCommonBandwidthPackagePayTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCommonBandwidthPackagePayTypeResponseBody getBody() {
        return this.body;
    }

}
