// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetSkillGroupServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSkillGroupServiceStatusResponseBody body;

    public static GetSkillGroupServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupServiceStatusResponse self = new GetSkillGroupServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillGroupServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillGroupServiceStatusResponse setBody(GetSkillGroupServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillGroupServiceStatusResponseBody getBody() {
        return this.body;
    }

}
