// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppAgentTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppAgentTemplateResponseBody body;

    public static ModifyAppAgentTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppAgentTemplateResponse self = new ModifyAppAgentTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppAgentTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppAgentTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppAgentTemplateResponse setBody(ModifyAppAgentTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppAgentTemplateResponseBody getBody() {
        return this.body;
    }

}
