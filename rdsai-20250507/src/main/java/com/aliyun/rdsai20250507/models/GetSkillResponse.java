// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillResponseBody body;

    public static GetSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillResponse self = new GetSkillResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillResponse setBody(GetSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillResponseBody getBody() {
        return this.body;
    }

}
