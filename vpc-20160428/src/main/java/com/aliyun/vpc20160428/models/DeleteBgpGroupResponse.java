// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBgpGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBgpGroupResponseBody body;

    public static DeleteBgpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBgpGroupResponse self = new DeleteBgpGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBgpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBgpGroupResponse setBody(DeleteBgpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBgpGroupResponseBody getBody() {
        return this.body;
    }

}
