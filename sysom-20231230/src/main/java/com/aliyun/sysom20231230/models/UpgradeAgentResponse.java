// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpgradeAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeAgentResponseBody body;

    public static UpgradeAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAgentResponse self = new UpgradeAgentResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeAgentResponse setBody(UpgradeAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeAgentResponseBody getBody() {
        return this.body;
    }

}
