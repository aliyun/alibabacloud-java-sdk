// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UploadMaterialFileForAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadMaterialFileForAdminResponseBody body;

    public static UploadMaterialFileForAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMaterialFileForAdminResponse self = new UploadMaterialFileForAdminResponse();
        return TeaModel.build(map, self);
    }

    public UploadMaterialFileForAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadMaterialFileForAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadMaterialFileForAdminResponse setBody(UploadMaterialFileForAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadMaterialFileForAdminResponseBody getBody() {
        return this.body;
    }

}
