// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateWebLockFileEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateWebLockFileEventsResponseBody body;

    public static OperateWebLockFileEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateWebLockFileEventsResponse self = new OperateWebLockFileEventsResponse();
        return TeaModel.build(map, self);
    }

    public OperateWebLockFileEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateWebLockFileEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateWebLockFileEventsResponse setBody(OperateWebLockFileEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateWebLockFileEventsResponseBody getBody() {
        return this.body;
    }

}
