// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAiotPersonTableItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAiotPersonTableItemResponseBody body;

    public static DeleteAiotPersonTableItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiotPersonTableItemResponse self = new DeleteAiotPersonTableItemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAiotPersonTableItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAiotPersonTableItemResponse setBody(DeleteAiotPersonTableItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAiotPersonTableItemResponseBody getBody() {
        return this.body;
    }

}
