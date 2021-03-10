// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListWorkspaceResponseBody body;

    public static ListWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceResponse self = new ListWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkspaceResponse setBody(ListWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkspaceResponseBody getBody() {
        return this.body;
    }

}
