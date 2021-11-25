// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class UpdateSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSkillGroupResponseBody body;

    public static UpdateSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillGroupResponse self = new UpdateSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSkillGroupResponse setBody(UpdateSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSkillGroupResponseBody getBody() {
        return this.body;
    }

}
