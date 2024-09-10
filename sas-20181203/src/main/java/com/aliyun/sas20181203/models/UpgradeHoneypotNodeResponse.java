// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpgradeHoneypotNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeHoneypotNodeResponseBody body;

    public static UpgradeHoneypotNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeHoneypotNodeResponse self = new UpgradeHoneypotNodeResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeHoneypotNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeHoneypotNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeHoneypotNodeResponse setBody(UpgradeHoneypotNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeHoneypotNodeResponseBody getBody() {
        return this.body;
    }

}
