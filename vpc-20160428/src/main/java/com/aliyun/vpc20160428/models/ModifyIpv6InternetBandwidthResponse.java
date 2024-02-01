// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6InternetBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIpv6InternetBandwidthResponseBody body;

    public static ModifyIpv6InternetBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6InternetBandwidthResponse self = new ModifyIpv6InternetBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpv6InternetBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpv6InternetBandwidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIpv6InternetBandwidthResponse setBody(ModifyIpv6InternetBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpv6InternetBandwidthResponseBody getBody() {
        return this.body;
    }

}
