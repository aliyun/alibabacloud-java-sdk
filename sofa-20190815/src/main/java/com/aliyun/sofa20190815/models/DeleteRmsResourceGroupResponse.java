// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRmsResourceGroupResponseBody body;

    public static DeleteRmsResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsResourceGroupResponse self = new DeleteRmsResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRmsResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRmsResourceGroupResponse setBody(DeleteRmsResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRmsResourceGroupResponseBody getBody() {
        return this.body;
    }

}
