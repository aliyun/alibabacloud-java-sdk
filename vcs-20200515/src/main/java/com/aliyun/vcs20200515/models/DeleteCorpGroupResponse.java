// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteCorpGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCorpGroupResponseBody body;

    public static DeleteCorpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCorpGroupResponse self = new DeleteCorpGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCorpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCorpGroupResponse setBody(DeleteCorpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCorpGroupResponseBody getBody() {
        return this.body;
    }

}
