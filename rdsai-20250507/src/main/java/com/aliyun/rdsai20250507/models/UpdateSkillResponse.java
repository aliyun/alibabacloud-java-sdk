// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSkillResponseBody body;

    public static UpdateSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillResponse self = new UpdateSkillResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSkillResponse setBody(UpdateSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSkillResponseBody getBody() {
        return this.body;
    }

}
