// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class DeleteFaceVideoTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFaceVideoTemplateResponseBody body;

    public static DeleteFaceVideoTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceVideoTemplateResponse self = new DeleteFaceVideoTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceVideoTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceVideoTemplateResponse setBody(DeleteFaceVideoTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceVideoTemplateResponseBody getBody() {
        return this.body;
    }

}
