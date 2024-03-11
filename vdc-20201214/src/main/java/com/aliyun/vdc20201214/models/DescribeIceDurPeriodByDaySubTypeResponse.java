// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeIceDurPeriodByDaySubTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIceDurPeriodByDaySubTypeResponseBody body;

    public static DescribeIceDurPeriodByDaySubTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIceDurPeriodByDaySubTypeResponse self = new DescribeIceDurPeriodByDaySubTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIceDurPeriodByDaySubTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIceDurPeriodByDaySubTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIceDurPeriodByDaySubTypeResponse setBody(DescribeIceDurPeriodByDaySubTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIceDurPeriodByDaySubTypeResponseBody getBody() {
        return this.body;
    }

}
