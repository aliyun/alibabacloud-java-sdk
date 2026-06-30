// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawAgentSkillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePolarClawAgentSkillsResponseBody body;

    public static UpdatePolarClawAgentSkillsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawAgentSkillsResponse self = new UpdatePolarClawAgentSkillsResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawAgentSkillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePolarClawAgentSkillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePolarClawAgentSkillsResponse setBody(UpdatePolarClawAgentSkillsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePolarClawAgentSkillsResponseBody getBody() {
        return this.body;
    }

}
