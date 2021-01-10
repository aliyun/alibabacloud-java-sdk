// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktModuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinktModuleResponseBody body;

    public static DeleteLinkeLinktModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktModuleResponse self = new DeleteLinkeLinktModuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinktModuleResponse setBody(DeleteLinkeLinktModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinktModuleResponseBody getBody() {
        return this.body;
    }

}
