// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListManifestEditTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListManifestEditTemplateResponseBody body;

    public static ListManifestEditTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListManifestEditTemplateResponse self = new ListManifestEditTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListManifestEditTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListManifestEditTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListManifestEditTemplateResponse setBody(ListManifestEditTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListManifestEditTemplateResponseBody getBody() {
        return this.body;
    }

}
