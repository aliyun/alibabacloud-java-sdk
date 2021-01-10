// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWorkspaceGroupResponseBody body;

    public static DeleteWorkspaceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceGroupResponse self = new DeleteWorkspaceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkspaceGroupResponse setBody(DeleteWorkspaceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkspaceGroupResponseBody getBody() {
        return this.body;
    }

}
