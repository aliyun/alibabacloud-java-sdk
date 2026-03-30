// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListVoiceEnginesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVoiceEnginesResponseBody body;

    public static ListVoiceEnginesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceEnginesResponse self = new ListVoiceEnginesResponse();
        return TeaModel.build(map, self);
    }

    public ListVoiceEnginesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVoiceEnginesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVoiceEnginesResponse setBody(ListVoiceEnginesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVoiceEnginesResponseBody getBody() {
        return this.body;
    }

}
