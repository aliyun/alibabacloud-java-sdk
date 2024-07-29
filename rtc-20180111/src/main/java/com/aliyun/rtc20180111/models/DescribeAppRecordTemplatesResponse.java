// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppRecordTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppRecordTemplatesResponseBody body;

    public static DescribeAppRecordTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppRecordTemplatesResponse self = new DescribeAppRecordTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppRecordTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppRecordTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppRecordTemplatesResponse setBody(DescribeAppRecordTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppRecordTemplatesResponseBody getBody() {
        return this.body;
    }

}
