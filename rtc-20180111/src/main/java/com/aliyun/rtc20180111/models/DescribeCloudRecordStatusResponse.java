// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCloudRecordStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudRecordStatusResponseBody body;

    public static DescribeCloudRecordStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudRecordStatusResponse self = new DescribeCloudRecordStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudRecordStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudRecordStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudRecordStatusResponse setBody(DescribeCloudRecordStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudRecordStatusResponseBody getBody() {
        return this.body;
    }

}
