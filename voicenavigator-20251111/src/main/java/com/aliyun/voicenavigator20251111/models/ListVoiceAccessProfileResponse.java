// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListVoiceAccessProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVoiceAccessProfileResponseBody body;

    public static ListVoiceAccessProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceAccessProfileResponse self = new ListVoiceAccessProfileResponse();
        return TeaModel.build(map, self);
    }

    public ListVoiceAccessProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVoiceAccessProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVoiceAccessProfileResponse setBody(ListVoiceAccessProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVoiceAccessProfileResponseBody getBody() {
        return this.body;
    }

}
