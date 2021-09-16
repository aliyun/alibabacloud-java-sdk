// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateDetectionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDetectionTemplateResponseBody body;

    public static UpdateDetectionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectionTemplateResponse self = new UpdateDetectionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDetectionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDetectionTemplateResponse setBody(UpdateDetectionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDetectionTemplateResponseBody getBody() {
        return this.body;
    }

}
