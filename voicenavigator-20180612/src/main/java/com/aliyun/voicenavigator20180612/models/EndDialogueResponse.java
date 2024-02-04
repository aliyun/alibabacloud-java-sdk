// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class EndDialogueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EndDialogueResponseBody body;

    public static EndDialogueResponse build(java.util.Map<String, ?> map) throws Exception {
        EndDialogueResponse self = new EndDialogueResponse();
        return TeaModel.build(map, self);
    }

    public EndDialogueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EndDialogueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EndDialogueResponse setBody(EndDialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public EndDialogueResponseBody getBody() {
        return this.body;
    }

}
