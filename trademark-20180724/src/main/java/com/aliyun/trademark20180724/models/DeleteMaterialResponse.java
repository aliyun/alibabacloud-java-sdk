// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DeleteMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMaterialResponseBody body;

    public static DeleteMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterialResponse self = new DeleteMaterialResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMaterialResponse setBody(DeleteMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMaterialResponseBody getBody() {
        return this.body;
    }

}
