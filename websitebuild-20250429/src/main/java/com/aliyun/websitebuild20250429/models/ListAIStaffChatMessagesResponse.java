// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAIStaffChatMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIStaffChatMessagesResponseBody body;

    public static ListAIStaffChatMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIStaffChatMessagesResponse self = new ListAIStaffChatMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListAIStaffChatMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIStaffChatMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIStaffChatMessagesResponse setBody(ListAIStaffChatMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIStaffChatMessagesResponseBody getBody() {
        return this.body;
    }

}
