// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class UpgradeProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeProxyResponseBody body;

    public static UpgradeProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeProxyResponse self = new UpgradeProxyResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeProxyResponse setBody(UpgradeProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeProxyResponseBody getBody() {
        return this.body;
    }

}
