// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BindCorpGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindCorpGroupResponseBody body;

    public static BindCorpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        BindCorpGroupResponse self = new BindCorpGroupResponse();
        return TeaModel.build(map, self);
    }

    public BindCorpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindCorpGroupResponse setBody(BindCorpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public BindCorpGroupResponseBody getBody() {
        return this.body;
    }

}
