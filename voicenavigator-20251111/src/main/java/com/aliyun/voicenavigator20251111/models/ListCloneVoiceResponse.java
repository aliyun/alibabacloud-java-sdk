// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListCloneVoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloneVoiceResponseBody body;

    public static ListCloneVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloneVoiceResponse self = new ListCloneVoiceResponse();
        return TeaModel.build(map, self);
    }

    public ListCloneVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloneVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloneVoiceResponse setBody(ListCloneVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloneVoiceResponseBody getBody() {
        return this.body;
    }

}
