// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveCommonBandwidthPackageIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveCommonBandwidthPackageIpResponseBody body;

    public static RemoveCommonBandwidthPackageIpResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveCommonBandwidthPackageIpResponse self = new RemoveCommonBandwidthPackageIpResponse();
        return TeaModel.build(map, self);
    }

    public RemoveCommonBandwidthPackageIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveCommonBandwidthPackageIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveCommonBandwidthPackageIpResponse setBody(RemoveCommonBandwidthPackageIpResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveCommonBandwidthPackageIpResponseBody getBody() {
        return this.body;
    }

}
