// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationServerlessConfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApplicationServerlessConfResponseBody body;

    public static ModifyApplicationServerlessConfResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationServerlessConfResponse self = new ModifyApplicationServerlessConfResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationServerlessConfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApplicationServerlessConfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApplicationServerlessConfResponse setBody(ModifyApplicationServerlessConfResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApplicationServerlessConfResponseBody getBody() {
        return this.body;
    }

}
