// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVodTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVodTemplateResponseBody body;

    public static GetVodTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVodTemplateResponse self = new GetVodTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetVodTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVodTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVodTemplateResponse setBody(GetVodTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVodTemplateResponseBody getBody() {
        return this.body;
    }

}
