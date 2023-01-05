// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptVoiceConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListScriptVoiceConfigsResponseBody body;

    public static ListScriptVoiceConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScriptVoiceConfigsResponse self = new ListScriptVoiceConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListScriptVoiceConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScriptVoiceConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScriptVoiceConfigsResponse setBody(ListScriptVoiceConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScriptVoiceConfigsResponseBody getBody() {
        return this.body;
    }

}
