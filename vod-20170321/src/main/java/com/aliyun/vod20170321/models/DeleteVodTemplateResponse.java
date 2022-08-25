// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVodTemplateResponseBody body;

    public static DeleteVodTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodTemplateResponse self = new DeleteVodTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVodTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVodTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVodTemplateResponse setBody(DeleteVodTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVodTemplateResponseBody getBody() {
        return this.body;
    }

}
