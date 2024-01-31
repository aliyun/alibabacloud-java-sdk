// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppStreamingOutTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppStreamingOutTemplateResponseBody body;

    public static ModifyAppStreamingOutTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppStreamingOutTemplateResponse self = new ModifyAppStreamingOutTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppStreamingOutTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppStreamingOutTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppStreamingOutTemplateResponse setBody(ModifyAppStreamingOutTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppStreamingOutTemplateResponseBody getBody() {
        return this.body;
    }

}
