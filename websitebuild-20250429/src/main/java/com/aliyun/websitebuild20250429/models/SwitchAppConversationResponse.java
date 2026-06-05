// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SwitchAppConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchAppConversationResponseBody body;

    public static SwitchAppConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchAppConversationResponse self = new SwitchAppConversationResponse();
        return TeaModel.build(map, self);
    }

    public SwitchAppConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchAppConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchAppConversationResponse setBody(SwitchAppConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchAppConversationResponseBody getBody() {
        return this.body;
    }

}
