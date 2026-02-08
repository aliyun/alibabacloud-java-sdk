// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModifyMaterialDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMaterialDirectoryResponseBody body;

    public static ModifyMaterialDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaterialDirectoryResponse self = new ModifyMaterialDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMaterialDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMaterialDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMaterialDirectoryResponse setBody(ModifyMaterialDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMaterialDirectoryResponseBody getBody() {
        return this.body;
    }

}
