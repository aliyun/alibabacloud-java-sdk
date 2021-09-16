// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDetectionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDetectionTemplateResponseBody body;

    public static GetDetectionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionTemplateResponse self = new GetDetectionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectionTemplateResponse setBody(GetDetectionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectionTemplateResponseBody getBody() {
        return this.body;
    }

}
