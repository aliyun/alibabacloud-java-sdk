// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ExportMaterialFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportMaterialFileResponseBody body;

    public static ExportMaterialFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportMaterialFileResponse self = new ExportMaterialFileResponse();
        return TeaModel.build(map, self);
    }

    public ExportMaterialFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportMaterialFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportMaterialFileResponse setBody(ExportMaterialFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportMaterialFileResponseBody getBody() {
        return this.body;
    }

}
