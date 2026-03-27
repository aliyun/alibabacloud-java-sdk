// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradePolarClawSkillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradePolarClawSkillsResponseBody body;

    public static UpgradePolarClawSkillsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradePolarClawSkillsResponse self = new UpgradePolarClawSkillsResponse();
        return TeaModel.build(map, self);
    }

    public UpgradePolarClawSkillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradePolarClawSkillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradePolarClawSkillsResponse setBody(UpgradePolarClawSkillsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradePolarClawSkillsResponseBody getBody() {
        return this.body;
    }

}
