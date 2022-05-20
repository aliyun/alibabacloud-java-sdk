// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220318.models;

import com.aliyun.tea.*;

public class ModifyApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyApplicationResponseBody body;

    public static ModifyApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationResponse self = new ModifyApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApplicationResponse setBody(ModifyApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApplicationResponseBody getBody() {
        return this.body;
    }

}
