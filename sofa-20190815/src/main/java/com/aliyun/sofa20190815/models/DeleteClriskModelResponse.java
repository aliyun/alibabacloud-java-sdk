// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClriskModelResponseBody body;

    public static DeleteClriskModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskModelResponse self = new DeleteClriskModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClriskModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClriskModelResponse setBody(DeleteClriskModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClriskModelResponseBody getBody() {
        return this.body;
    }

}
