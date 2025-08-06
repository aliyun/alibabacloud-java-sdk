// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultVodTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDefaultVodTemplateResponseBody body;

    public static SetDefaultVodTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultVodTemplateResponse self = new SetDefaultVodTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultVodTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultVodTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultVodTemplateResponse setBody(SetDefaultVodTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultVodTemplateResponseBody getBody() {
        return this.body;
    }

}
