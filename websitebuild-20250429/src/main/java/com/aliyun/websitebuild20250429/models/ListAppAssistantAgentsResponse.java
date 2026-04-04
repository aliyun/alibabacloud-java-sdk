// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppAssistantAgentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppAssistantAgentsResponseBody body;

    public static ListAppAssistantAgentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppAssistantAgentsResponse self = new ListAppAssistantAgentsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppAssistantAgentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppAssistantAgentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppAssistantAgentsResponse setBody(ListAppAssistantAgentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppAssistantAgentsResponseBody getBody() {
        return this.body;
    }

}
