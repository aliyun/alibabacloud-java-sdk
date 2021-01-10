// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ExportConversationDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportConversationDetailsResponseBody body;

    public static ExportConversationDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportConversationDetailsResponse self = new ExportConversationDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ExportConversationDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportConversationDetailsResponse setBody(ExportConversationDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportConversationDetailsResponseBody getBody() {
        return this.body;
    }

}
