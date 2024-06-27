// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyTemplateStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTemplateStatusResponseBody body;

    public static ModifyTemplateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateStatusResponse self = new ModifyTemplateStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTemplateStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTemplateStatusResponse setBody(ModifyTemplateStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTemplateStatusResponseBody getBody() {
        return this.body;
    }

}
