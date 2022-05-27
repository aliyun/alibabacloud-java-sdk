// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DownloadTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadTemplateResponseBody body;

    public static DownloadTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadTemplateResponse self = new DownloadTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DownloadTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadTemplateResponse setBody(DownloadTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadTemplateResponseBody getBody() {
        return this.body;
    }

}
