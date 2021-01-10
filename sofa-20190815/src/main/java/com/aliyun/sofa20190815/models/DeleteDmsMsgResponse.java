// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDmsMsgResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDmsMsgResponseBody body;

    public static DeleteDmsMsgResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDmsMsgResponse self = new DeleteDmsMsgResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDmsMsgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDmsMsgResponse setBody(DeleteDmsMsgResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDmsMsgResponseBody getBody() {
        return this.body;
    }

}
