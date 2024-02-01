// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CheckVpnBgpEnabledResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckVpnBgpEnabledResponseBody body;

    public static CheckVpnBgpEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckVpnBgpEnabledResponse self = new CheckVpnBgpEnabledResponse();
        return TeaModel.build(map, self);
    }

    public CheckVpnBgpEnabledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckVpnBgpEnabledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckVpnBgpEnabledResponse setBody(CheckVpnBgpEnabledResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckVpnBgpEnabledResponseBody getBody() {
        return this.body;
    }

}
