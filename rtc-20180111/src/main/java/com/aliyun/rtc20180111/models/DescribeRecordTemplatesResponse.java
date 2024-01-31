// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRecordTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeRecordTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecordTemplatesResponse setBody(DescribeRecordTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordTemplatesResponseBody getBody() {
        return this.body;
    }

}
