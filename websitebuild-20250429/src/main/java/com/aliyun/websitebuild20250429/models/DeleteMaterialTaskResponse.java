// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteMaterialTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMaterialTaskResponseBody body;

    public static DeleteMaterialTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterialTaskResponse self = new DeleteMaterialTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMaterialTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMaterialTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMaterialTaskResponse setBody(DeleteMaterialTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMaterialTaskResponseBody getBody() {
        return this.body;
    }

}
