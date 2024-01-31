// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRdsResourceSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRdsResourceSettingsResponseBody body;

    public static DescribeRdsResourceSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsResourceSettingsResponse self = new DescribeRdsResourceSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsResourceSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsResourceSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRdsResourceSettingsResponse setBody(DescribeRdsResourceSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsResourceSettingsResponseBody getBody() {
        return this.body;
    }

}
