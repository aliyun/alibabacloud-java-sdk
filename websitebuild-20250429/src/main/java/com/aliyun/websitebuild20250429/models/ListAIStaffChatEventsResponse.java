// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAIStaffChatEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIStaffChatEventsResponseBody body;

    public static ListAIStaffChatEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIStaffChatEventsResponse self = new ListAIStaffChatEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListAIStaffChatEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIStaffChatEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIStaffChatEventsResponse setBody(ListAIStaffChatEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIStaffChatEventsResponseBody getBody() {
        return this.body;
    }

}
