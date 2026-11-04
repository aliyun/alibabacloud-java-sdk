// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UninstallPolarClawSkillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallPolarClawSkillsResponseBody body;

    public static UninstallPolarClawSkillsResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallPolarClawSkillsResponse self = new UninstallPolarClawSkillsResponse();
        return TeaModel.build(map, self);
    }

    public UninstallPolarClawSkillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallPolarClawSkillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallPolarClawSkillsResponse setBody(UninstallPolarClawSkillsResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallPolarClawSkillsResponseBody getBody() {
        return this.body;
    }

}
