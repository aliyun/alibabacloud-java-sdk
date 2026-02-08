// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateMaterialDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMaterialDirectoryResponseBody body;

    public static CreateMaterialDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMaterialDirectoryResponse self = new CreateMaterialDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateMaterialDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMaterialDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMaterialDirectoryResponse setBody(CreateMaterialDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMaterialDirectoryResponseBody getBody() {
        return this.body;
    }

}
