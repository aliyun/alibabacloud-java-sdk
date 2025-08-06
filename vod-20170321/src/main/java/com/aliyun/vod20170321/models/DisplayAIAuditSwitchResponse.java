// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DisplayAIAuditSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisplayAIAuditSwitchResponseBody body;

    public static DisplayAIAuditSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DisplayAIAuditSwitchResponse self = new DisplayAIAuditSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DisplayAIAuditSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisplayAIAuditSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisplayAIAuditSwitchResponse setBody(DisplayAIAuditSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DisplayAIAuditSwitchResponseBody getBody() {
        return this.body;
    }

}
