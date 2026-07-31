// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class ListVoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVoiceResponseBody body;

    public static ListVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceResponse self = new ListVoiceResponse();
        return TeaModel.build(map, self);
    }

    public ListVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVoiceResponse setBody(ListVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVoiceResponseBody getBody() {
        return this.body;
    }

}
