// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteSkillGroupConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSkillGroupConfigResponseBody body;

    public static DeleteSkillGroupConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillGroupConfigResponse self = new DeleteSkillGroupConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSkillGroupConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSkillGroupConfigResponse setBody(DeleteSkillGroupConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSkillGroupConfigResponseBody getBody() {
        return this.body;
    }

}
