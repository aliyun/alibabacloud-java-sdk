// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddCommonBandwidthPackageIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddCommonBandwidthPackageIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCommonBandwidthPackageIpsResponse setBody(AddCommonBandwidthPackageIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCommonBandwidthPackageIpsResponseBody getBody() {
        return this.body;
    }

}
