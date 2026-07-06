// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpgradeAgentWithTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeAgentWithTypeResponseBody body;

    public static UpgradeAgentWithTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAgentWithTypeResponse self = new UpgradeAgentWithTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeAgentWithTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeAgentWithTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeAgentWithTypeResponse setBody(UpgradeAgentWithTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeAgentWithTypeResponseBody getBody() {
        return this.body;
    }

}
