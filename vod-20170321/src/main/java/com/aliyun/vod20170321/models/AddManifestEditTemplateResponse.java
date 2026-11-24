// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddManifestEditTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddManifestEditTemplateResponseBody body;

    public static AddManifestEditTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddManifestEditTemplateResponse self = new AddManifestEditTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddManifestEditTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddManifestEditTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddManifestEditTemplateResponse setBody(AddManifestEditTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddManifestEditTemplateResponseBody getBody() {
        return this.body;
    }

}
