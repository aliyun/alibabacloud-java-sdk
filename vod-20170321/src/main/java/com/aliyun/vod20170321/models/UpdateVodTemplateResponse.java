// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVodTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVodTemplateResponseBody body;

    public static UpdateVodTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVodTemplateResponse self = new UpdateVodTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVodTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVodTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVodTemplateResponse setBody(UpdateVodTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVodTemplateResponseBody getBody() {
        return this.body;
    }

}
