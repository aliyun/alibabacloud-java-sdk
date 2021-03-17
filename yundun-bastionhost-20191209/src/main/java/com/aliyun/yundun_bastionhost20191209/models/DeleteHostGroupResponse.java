// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHostGroupResponseBody body;

    public static DeleteHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostGroupResponse self = new DeleteHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHostGroupResponse setBody(DeleteHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHostGroupResponseBody getBody() {
        return this.body;
    }

}
