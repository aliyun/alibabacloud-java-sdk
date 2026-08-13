// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSkillRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillRunResponseBody body;

    public static GetSkillRunResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillRunResponse self = new GetSkillRunResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillRunResponse setBody(GetSkillRunResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillRunResponseBody getBody() {
        return this.body;
    }

}
