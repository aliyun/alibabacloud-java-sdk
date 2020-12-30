// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCommonBandwidthPackageSpecResponseBody body;

    public static ModifyCommonBandwidthPackageSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageSpecResponse self = new ModifyCommonBandwidthPackageSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackageSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCommonBandwidthPackageSpecResponse setBody(ModifyCommonBandwidthPackageSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCommonBandwidthPackageSpecResponseBody getBody() {
        return this.body;
    }

}
