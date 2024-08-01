// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeZoneRecordResponseBody body;

    public static DescribeZoneRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneRecordResponse self = new DescribeZoneRecordResponse();
        return TeaModel.build(map, self);
    }

    public DescribeZoneRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeZoneRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeZoneRecordResponse setBody(DescribeZoneRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeZoneRecordResponseBody getBody() {
        return this.body;
    }

}
