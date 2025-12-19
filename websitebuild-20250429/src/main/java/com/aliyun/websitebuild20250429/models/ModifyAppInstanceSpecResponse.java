// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppInstanceSpecResponseBody body;

    public static ModifyAppInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceSpecResponse self = new ModifyAppInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppInstanceSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppInstanceSpecResponse setBody(ModifyAppInstanceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppInstanceSpecResponseBody getBody() {
        return this.body;
    }

}
