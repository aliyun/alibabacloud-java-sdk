// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCloudNotesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudNotesResponseBody body;

    public static DescribeCloudNotesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudNotesResponse self = new DescribeCloudNotesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudNotesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudNotesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudNotesResponse setBody(DescribeCloudNotesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudNotesResponseBody getBody() {
        return this.body;
    }

}
