// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteMaterialDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMaterialDirectoryResponseBody body;

    public static DeleteMaterialDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterialDirectoryResponse self = new DeleteMaterialDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMaterialDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMaterialDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMaterialDirectoryResponse setBody(DeleteMaterialDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMaterialDirectoryResponseBody getBody() {
        return this.body;
    }

}
