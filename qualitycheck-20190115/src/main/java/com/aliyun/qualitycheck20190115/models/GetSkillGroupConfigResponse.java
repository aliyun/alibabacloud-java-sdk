// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSkillGroupConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSkillGroupConfigResponseBody body;

    public static GetSkillGroupConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupConfigResponse self = new GetSkillGroupConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillGroupConfigResponse setBody(GetSkillGroupConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillGroupConfigResponseBody getBody() {
        return this.body;
    }

}
