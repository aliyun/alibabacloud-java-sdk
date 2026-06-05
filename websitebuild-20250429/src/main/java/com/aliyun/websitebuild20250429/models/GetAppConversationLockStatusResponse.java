// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppConversationLockStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppConversationLockStatusResponseBody body;

    public static GetAppConversationLockStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppConversationLockStatusResponse self = new GetAppConversationLockStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAppConversationLockStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppConversationLockStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppConversationLockStatusResponse setBody(GetAppConversationLockStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppConversationLockStatusResponseBody getBody() {
        return this.body;
    }

}
