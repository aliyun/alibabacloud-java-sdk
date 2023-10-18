// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectMaterialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEditingProjectMaterialsResponseBody body;

    public static DeleteEditingProjectMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectMaterialsResponse self = new DeleteEditingProjectMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectMaterialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEditingProjectMaterialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEditingProjectMaterialsResponse setBody(DeleteEditingProjectMaterialsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEditingProjectMaterialsResponseBody getBody() {
        return this.body;
    }

}
