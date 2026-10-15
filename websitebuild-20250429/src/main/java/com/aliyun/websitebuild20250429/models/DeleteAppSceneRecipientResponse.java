// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppSceneRecipientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppSceneRecipientResponseBody body;

    public static DeleteAppSceneRecipientResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppSceneRecipientResponse self = new DeleteAppSceneRecipientResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppSceneRecipientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppSceneRecipientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppSceneRecipientResponse setBody(DeleteAppSceneRecipientResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppSceneRecipientResponseBody getBody() {
        return this.body;
    }

}
