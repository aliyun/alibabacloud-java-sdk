// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListVoiceCloneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVoiceCloneResponseBody body;

    public static ListVoiceCloneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceCloneResponse self = new ListVoiceCloneResponse();
        return TeaModel.build(map, self);
    }

    public ListVoiceCloneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVoiceCloneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVoiceCloneResponse setBody(ListVoiceCloneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVoiceCloneResponseBody getBody() {
        return this.body;
    }

}
