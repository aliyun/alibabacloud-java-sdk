// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDmsMsgTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDmsMsgTypeResponseBody body;

    public static DeleteDmsMsgTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDmsMsgTypeResponse self = new DeleteDmsMsgTypeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDmsMsgTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDmsMsgTypeResponse setBody(DeleteDmsMsgTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDmsMsgTypeResponseBody getBody() {
        return this.body;
    }

}
