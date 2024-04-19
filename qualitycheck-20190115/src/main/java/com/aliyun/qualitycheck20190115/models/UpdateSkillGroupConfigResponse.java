// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSkillGroupConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSkillGroupConfigResponseBody body;

    public static UpdateSkillGroupConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillGroupConfigResponse self = new UpdateSkillGroupConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSkillGroupConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSkillGroupConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSkillGroupConfigResponse setBody(UpdateSkillGroupConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSkillGroupConfigResponseBody getBody() {
        return this.body;
    }

}
