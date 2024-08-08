// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class SyncMemberBehaviorInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncMemberBehaviorInfoResponseBody body;

    public static SyncMemberBehaviorInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncMemberBehaviorInfoResponse self = new SyncMemberBehaviorInfoResponse();
        return TeaModel.build(map, self);
    }

    public SyncMemberBehaviorInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncMemberBehaviorInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncMemberBehaviorInfoResponse setBody(SyncMemberBehaviorInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncMemberBehaviorInfoResponseBody getBody() {
        return this.body;
    }

}
