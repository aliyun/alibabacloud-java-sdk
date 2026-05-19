// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAIStaffChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAIStaffChatResponseBody body;

    public static CreateAIStaffChatResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAIStaffChatResponse self = new CreateAIStaffChatResponse();
        return TeaModel.build(map, self);
    }

    public CreateAIStaffChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAIStaffChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAIStaffChatResponse setBody(CreateAIStaffChatResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAIStaffChatResponseBody getBody() {
        return this.body;
    }

}
