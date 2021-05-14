// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlarmEventListResponseBody body;

    public static DescribeAlarmEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventListResponse self = new DescribeAlarmEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlarmEventListResponse setBody(DescribeAlarmEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlarmEventListResponseBody getBody() {
        return this.body;
    }

}
