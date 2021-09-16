// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteDetectionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDetectionTemplateResponseBody body;

    public static DeleteDetectionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDetectionTemplateResponse self = new DeleteDetectionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDetectionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDetectionTemplateResponse setBody(DeleteDetectionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDetectionTemplateResponseBody getBody() {
        return this.body;
    }

}
