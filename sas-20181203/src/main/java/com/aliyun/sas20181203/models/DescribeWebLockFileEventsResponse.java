// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebLockFileEventsResponseBody body;

    public static DescribeWebLockFileEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockFileEventsResponse self = new DescribeWebLockFileEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockFileEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebLockFileEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebLockFileEventsResponse setBody(DescribeWebLockFileEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebLockFileEventsResponseBody getBody() {
        return this.body;
    }

}
