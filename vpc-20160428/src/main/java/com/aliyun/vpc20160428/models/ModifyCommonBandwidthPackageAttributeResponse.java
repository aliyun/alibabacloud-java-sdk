// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCommonBandwidthPackageAttributeResponseBody body;

    public static ModifyCommonBandwidthPackageAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageAttributeResponse self = new ModifyCommonBandwidthPackageAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackageAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCommonBandwidthPackageAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCommonBandwidthPackageAttributeResponse setBody(ModifyCommonBandwidthPackageAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCommonBandwidthPackageAttributeResponseBody getBody() {
        return this.body;
    }

}
