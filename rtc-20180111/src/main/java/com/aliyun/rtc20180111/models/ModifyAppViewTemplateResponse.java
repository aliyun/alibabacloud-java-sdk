// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppViewTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppViewTemplateResponseBody body;

    public static ModifyAppViewTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppViewTemplateResponse self = new ModifyAppViewTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppViewTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppViewTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppViewTemplateResponse setBody(ModifyAppViewTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppViewTemplateResponseBody getBody() {
        return this.body;
    }

}
