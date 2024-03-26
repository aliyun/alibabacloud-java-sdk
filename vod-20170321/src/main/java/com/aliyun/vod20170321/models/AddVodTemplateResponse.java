// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddVodTemplateResponseBody body;

    public static AddVodTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVodTemplateResponse self = new AddVodTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddVodTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVodTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddVodTemplateResponse setBody(AddVodTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVodTemplateResponseBody getBody() {
        return this.body;
    }

}
