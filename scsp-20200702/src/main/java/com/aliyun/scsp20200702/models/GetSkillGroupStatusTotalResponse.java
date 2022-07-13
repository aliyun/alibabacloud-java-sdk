// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetSkillGroupStatusTotalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSkillGroupStatusTotalResponseBody body;

    public static GetSkillGroupStatusTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupStatusTotalResponse self = new GetSkillGroupStatusTotalResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupStatusTotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillGroupStatusTotalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillGroupStatusTotalResponse setBody(GetSkillGroupStatusTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillGroupStatusTotalResponseBody getBody() {
        return this.body;
    }

}
