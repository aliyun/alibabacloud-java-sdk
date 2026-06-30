// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class InstallPolarClawSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallPolarClawSkillResponseBody body;

    public static InstallPolarClawSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallPolarClawSkillResponse self = new InstallPolarClawSkillResponse();
        return TeaModel.build(map, self);
    }

    public InstallPolarClawSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallPolarClawSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallPolarClawSkillResponse setBody(InstallPolarClawSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallPolarClawSkillResponseBody getBody() {
        return this.body;
    }

}
