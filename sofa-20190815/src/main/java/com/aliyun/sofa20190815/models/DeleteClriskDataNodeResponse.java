// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskDataNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClriskDataNodeResponseBody body;

    public static DeleteClriskDataNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskDataNodeResponse self = new DeleteClriskDataNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClriskDataNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClriskDataNodeResponse setBody(DeleteClriskDataNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClriskDataNodeResponseBody getBody() {
        return this.body;
    }

}
