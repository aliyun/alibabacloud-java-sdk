// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class BeginDialogueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BeginDialogueResponseBody body;

    public static BeginDialogueResponse build(java.util.Map<String, ?> map) throws Exception {
        BeginDialogueResponse self = new BeginDialogueResponse();
        return TeaModel.build(map, self);
    }

    public BeginDialogueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BeginDialogueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BeginDialogueResponse setBody(BeginDialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public BeginDialogueResponseBody getBody() {
        return this.body;
    }

}
