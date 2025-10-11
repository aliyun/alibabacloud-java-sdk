// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApplicationDescriptionResponseBody body;

    public static ModifyApplicationDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationDescriptionResponse self = new ModifyApplicationDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApplicationDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApplicationDescriptionResponse setBody(ModifyApplicationDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApplicationDescriptionResponseBody getBody() {
        return this.body;
    }

}
