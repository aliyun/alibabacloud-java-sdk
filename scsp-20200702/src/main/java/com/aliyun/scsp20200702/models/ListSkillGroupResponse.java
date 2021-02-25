// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class ListSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSkillGroupResponseBody body;

    public static ListSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupResponse self = new ListSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillGroupResponse setBody(ListSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupResponseBody getBody() {
        return this.body;
    }

}
