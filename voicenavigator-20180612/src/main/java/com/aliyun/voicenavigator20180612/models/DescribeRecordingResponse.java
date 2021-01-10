// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeRecordingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeRecordingResponse setBody(DescribeRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordingResponseBody getBody() {
        return this.body;
    }

}
