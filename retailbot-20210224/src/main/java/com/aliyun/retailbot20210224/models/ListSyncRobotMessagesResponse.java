// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSyncRobotMessagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSyncRobotMessagesResponseBody body;

    public static ListSyncRobotMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSyncRobotMessagesResponse self = new ListSyncRobotMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListSyncRobotMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSyncRobotMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSyncRobotMessagesResponse setBody(ListSyncRobotMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSyncRobotMessagesResponseBody getBody() {
        return this.body;
    }

}
