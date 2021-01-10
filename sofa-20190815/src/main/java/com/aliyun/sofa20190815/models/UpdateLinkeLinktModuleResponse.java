// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktModuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktModuleResponseBody body;

    public static UpdateLinkeLinktModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktModuleResponse self = new UpdateLinkeLinktModuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktModuleResponse setBody(UpdateLinkeLinktModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktModuleResponseBody getBody() {
        return this.body;
    }

}
