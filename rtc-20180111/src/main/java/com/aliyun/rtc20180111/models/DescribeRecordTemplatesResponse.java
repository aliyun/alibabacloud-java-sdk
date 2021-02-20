// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRecordTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecordTemplatesResponseBody body;

    public static DescribeRecordTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordTemplatesResponse self = new DescribeRecordTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordTemplatesResponse setBody(DescribeRecordTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordTemplatesResponseBody getBody() {
        return this.body;
    }

}
