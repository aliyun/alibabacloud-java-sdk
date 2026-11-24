// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteManifestEditTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteManifestEditTemplateResponseBody body;

    public static DeleteManifestEditTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteManifestEditTemplateResponse self = new DeleteManifestEditTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteManifestEditTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteManifestEditTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteManifestEditTemplateResponse setBody(DeleteManifestEditTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteManifestEditTemplateResponseBody getBody() {
        return this.body;
    }

}
