// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeZoneRecordsResponseBody body;

    public static DescribeZoneRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneRecordsResponse self = new DescribeZoneRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeZoneRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeZoneRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeZoneRecordsResponse setBody(DescribeZoneRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeZoneRecordsResponseBody getBody() {
        return this.body;
    }

}
