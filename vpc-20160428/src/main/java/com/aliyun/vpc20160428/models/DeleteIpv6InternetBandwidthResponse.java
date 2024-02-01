// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv6InternetBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpv6InternetBandwidthResponseBody body;

    public static DeleteIpv6InternetBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv6InternetBandwidthResponse self = new DeleteIpv6InternetBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpv6InternetBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpv6InternetBandwidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpv6InternetBandwidthResponse setBody(DeleteIpv6InternetBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpv6InternetBandwidthResponseBody getBody() {
        return this.body;
    }

}
