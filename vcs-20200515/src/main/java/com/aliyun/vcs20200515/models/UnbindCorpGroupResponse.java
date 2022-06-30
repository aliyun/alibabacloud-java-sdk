// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnbindCorpGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindCorpGroupResponseBody body;

    public static UnbindCorpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindCorpGroupResponse self = new UnbindCorpGroupResponse();
        return TeaModel.build(map, self);
    }

    public UnbindCorpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindCorpGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindCorpGroupResponse setBody(UnbindCorpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindCorpGroupResponseBody getBody() {
        return this.body;
    }

}
