// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVodTemplateResponseBody body;

    public static ListVodTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVodTemplateResponse self = new ListVodTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListVodTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVodTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVodTemplateResponse setBody(ListVodTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVodTemplateResponseBody getBody() {
        return this.body;
    }

}
