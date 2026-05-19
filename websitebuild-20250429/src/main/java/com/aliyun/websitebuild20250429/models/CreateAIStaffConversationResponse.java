// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAIStaffConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAIStaffConversationResponseBody body;

    public static CreateAIStaffConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAIStaffConversationResponse self = new CreateAIStaffConversationResponse();
        return TeaModel.build(map, self);
    }

    public CreateAIStaffConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAIStaffConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAIStaffConversationResponse setBody(CreateAIStaffConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAIStaffConversationResponseBody getBody() {
        return this.body;
    }

}
