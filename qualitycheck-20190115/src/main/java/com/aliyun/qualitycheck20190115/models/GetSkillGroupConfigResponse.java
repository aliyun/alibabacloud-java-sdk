// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSkillGroupConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetSkillGroupConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillGroupConfigResponse setBody(GetSkillGroupConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillGroupConfigResponseBody getBody() {
        return this.body;
    }

}
