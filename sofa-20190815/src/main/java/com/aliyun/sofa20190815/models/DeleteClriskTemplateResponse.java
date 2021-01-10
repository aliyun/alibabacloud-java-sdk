// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClriskTemplateResponseBody body;

    public static DeleteClriskTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskTemplateResponse self = new DeleteClriskTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClriskTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClriskTemplateResponse setBody(DeleteClriskTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClriskTemplateResponseBody getBody() {
        return this.body;
    }

}
