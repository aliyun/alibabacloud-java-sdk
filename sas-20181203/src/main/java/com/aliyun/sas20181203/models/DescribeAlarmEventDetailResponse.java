// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlarmEventDetailResponseBody body;

    public static DescribeAlarmEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventDetailResponse self = new DescribeAlarmEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlarmEventDetailResponse setBody(DescribeAlarmEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlarmEventDetailResponseBody getBody() {
        return this.body;
    }

}
