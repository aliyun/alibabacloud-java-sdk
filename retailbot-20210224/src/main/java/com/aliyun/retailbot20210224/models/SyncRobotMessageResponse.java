// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class SyncRobotMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SyncRobotMessageResponseBody body;

    public static SyncRobotMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncRobotMessageResponse self = new SyncRobotMessageResponse();
        return TeaModel.build(map, self);
    }

    public SyncRobotMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncRobotMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncRobotMessageResponse setBody(SyncRobotMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncRobotMessageResponseBody getBody() {
        return this.body;
    }

}
