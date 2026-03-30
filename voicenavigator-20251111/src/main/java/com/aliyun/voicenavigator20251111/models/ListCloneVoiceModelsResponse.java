// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListCloneVoiceModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloneVoiceModelsResponseBody body;

    public static ListCloneVoiceModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloneVoiceModelsResponse self = new ListCloneVoiceModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListCloneVoiceModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloneVoiceModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloneVoiceModelsResponse setBody(ListCloneVoiceModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloneVoiceModelsResponseBody getBody() {
        return this.body;
    }

}
