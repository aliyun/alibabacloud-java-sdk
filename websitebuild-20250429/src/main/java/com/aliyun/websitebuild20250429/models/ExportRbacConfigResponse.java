// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ExportRbacConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportRbacConfigResponseBody body;

    public static ExportRbacConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportRbacConfigResponse self = new ExportRbacConfigResponse();
        return TeaModel.build(map, self);
    }

    public ExportRbacConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportRbacConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportRbacConfigResponse setBody(ExportRbacConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportRbacConfigResponseBody getBody() {
        return this.body;
    }

}
