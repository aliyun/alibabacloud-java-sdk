// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteVoiceCloneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVoiceCloneResponseBody body;

    public static DeleteVoiceCloneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVoiceCloneResponse self = new DeleteVoiceCloneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVoiceCloneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVoiceCloneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVoiceCloneResponse setBody(DeleteVoiceCloneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVoiceCloneResponseBody getBody() {
        return this.body;
    }

}
