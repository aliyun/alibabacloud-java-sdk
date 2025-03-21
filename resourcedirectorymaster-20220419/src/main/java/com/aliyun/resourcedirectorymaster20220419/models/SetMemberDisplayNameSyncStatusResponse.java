// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SetMemberDisplayNameSyncStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetMemberDisplayNameSyncStatusResponseBody body;

    public static SetMemberDisplayNameSyncStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMemberDisplayNameSyncStatusResponse self = new SetMemberDisplayNameSyncStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetMemberDisplayNameSyncStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetMemberDisplayNameSyncStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetMemberDisplayNameSyncStatusResponse setBody(SetMemberDisplayNameSyncStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMemberDisplayNameSyncStatusResponseBody getBody() {
        return this.body;
    }

}
