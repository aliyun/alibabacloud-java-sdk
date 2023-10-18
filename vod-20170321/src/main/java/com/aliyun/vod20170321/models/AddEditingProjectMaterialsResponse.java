// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddEditingProjectMaterialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddEditingProjectMaterialsResponseBody body;

    public static AddEditingProjectMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectMaterialsResponse self = new AddEditingProjectMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public AddEditingProjectMaterialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEditingProjectMaterialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEditingProjectMaterialsResponse setBody(AddEditingProjectMaterialsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEditingProjectMaterialsResponseBody getBody() {
        return this.body;
    }

}
