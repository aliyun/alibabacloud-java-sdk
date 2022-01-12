// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetSkillGroupAgentStatusDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSkillGroupAgentStatusDetailsResponseBody body;

    public static GetSkillGroupAgentStatusDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupAgentStatusDetailsResponse self = new GetSkillGroupAgentStatusDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupAgentStatusDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillGroupAgentStatusDetailsResponse setBody(GetSkillGroupAgentStatusDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillGroupAgentStatusDetailsResponseBody getBody() {
        return this.body;
    }

}
