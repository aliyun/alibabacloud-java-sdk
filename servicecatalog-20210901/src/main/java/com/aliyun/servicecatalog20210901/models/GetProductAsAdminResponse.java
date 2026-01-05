// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProductAsAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductAsAdminResponseBody body;

    public static GetProductAsAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductAsAdminResponse self = new GetProductAsAdminResponse();
        return TeaModel.build(map, self);
    }

    public GetProductAsAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductAsAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductAsAdminResponse setBody(GetProductAsAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductAsAdminResponseBody getBody() {
        return this.body;
    }

}
