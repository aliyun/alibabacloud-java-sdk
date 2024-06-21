// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppRecordingFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppRecordingFilesResponseBody body;

    public static DescribeAppRecordingFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppRecordingFilesResponse self = new DescribeAppRecordingFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppRecordingFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppRecordingFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppRecordingFilesResponse setBody(DescribeAppRecordingFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppRecordingFilesResponseBody getBody() {
        return this.body;
    }

}
