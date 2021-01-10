// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class EndDialogueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EndDialogueResponse setBody(EndDialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public EndDialogueResponseBody getBody() {
        return this.body;
    }

}
