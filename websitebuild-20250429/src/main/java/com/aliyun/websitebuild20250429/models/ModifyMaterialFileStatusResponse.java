// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModifyMaterialFileStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMaterialFileStatusResponseBody body;

    public static ModifyMaterialFileStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaterialFileStatusResponse self = new ModifyMaterialFileStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMaterialFileStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMaterialFileStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMaterialFileStatusResponse setBody(ModifyMaterialFileStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMaterialFileStatusResponseBody getBody() {
        return this.body;
    }

}
