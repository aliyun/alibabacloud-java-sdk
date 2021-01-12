// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRdsResourceSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeRdsResourceSettingsResponse setBody(DescribeRdsResourceSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsResourceSettingsResponseBody getBody() {
        return this.body;
    }

}
