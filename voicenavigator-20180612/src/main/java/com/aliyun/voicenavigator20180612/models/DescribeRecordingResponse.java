// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecordingResponseBody body;

    public static DescribeRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordingResponse self = new DescribeRecordingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecordingResponse setBody(DescribeRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordingResponseBody getBody() {
        return this.body;
    }

}
