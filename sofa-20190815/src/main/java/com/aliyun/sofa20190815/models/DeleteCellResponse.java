// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCellResponseBody body;

    public static DeleteCellResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCellResponse self = new DeleteCellResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCellResponse setBody(DeleteCellResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCellResponseBody getBody() {
        return this.body;
    }

}
