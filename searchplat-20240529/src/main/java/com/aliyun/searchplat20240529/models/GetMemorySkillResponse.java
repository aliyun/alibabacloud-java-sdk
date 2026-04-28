// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMemorySkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMemorySkillResponseBody body;

    public static GetMemorySkillResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemorySkillResponse self = new GetMemorySkillResponse();
        return TeaModel.build(map, self);
    }

    public GetMemorySkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemorySkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemorySkillResponse setBody(GetMemorySkillResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemorySkillResponseBody getBody() {
        return this.body;
    }

}
