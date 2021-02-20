// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResourceGroupResponseBody body;

    public static DeleteResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceGroupResponse self = new DeleteResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceGroupResponse setBody(DeleteResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceGroupResponseBody getBody() {
        return this.body;
    }

}
