// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UploadMaterialFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadMaterialFileResponseBody body;

    public static UploadMaterialFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMaterialFileResponse self = new UploadMaterialFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadMaterialFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadMaterialFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadMaterialFileResponse setBody(UploadMaterialFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadMaterialFileResponseBody getBody() {
        return this.body;
    }

}
