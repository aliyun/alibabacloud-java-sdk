// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRecordFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecordFilesResponseBody body;

    public static DescribeRecordFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordFilesResponse self = new DescribeRecordFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecordFilesResponse setBody(DescribeRecordFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordFilesResponseBody getBody() {
        return this.body;
    }

}
