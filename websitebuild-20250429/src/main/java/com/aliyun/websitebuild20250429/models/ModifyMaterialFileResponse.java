// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModifyMaterialFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMaterialFileResponseBody body;

    public static ModifyMaterialFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaterialFileResponse self = new ModifyMaterialFileResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMaterialFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMaterialFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMaterialFileResponse setBody(ModifyMaterialFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMaterialFileResponseBody getBody() {
        return this.body;
    }

}
