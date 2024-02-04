// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DialogueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DialogueResponseBody body;

    public static DialogueResponse build(java.util.Map<String, ?> map) throws Exception {
        DialogueResponse self = new DialogueResponse();
        return TeaModel.build(map, self);
    }

    public DialogueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DialogueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DialogueResponse setBody(DialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public DialogueResponseBody getBody() {
        return this.body;
    }

}
