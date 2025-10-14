// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeRdsVswitchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRdsVswitchesResponseBody body;

    public static DescribeRdsVswitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsVswitchesResponse self = new DescribeRdsVswitchesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsVswitchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsVswitchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRdsVswitchesResponse setBody(DescribeRdsVswitchesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsVswitchesResponseBody getBody() {
        return this.body;
    }

}
