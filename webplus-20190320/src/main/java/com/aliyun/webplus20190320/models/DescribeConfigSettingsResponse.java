// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeConfigSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConfigSettingsResponseBody body;

    public static DescribeConfigSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigSettingsResponse self = new DescribeConfigSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigSettingsResponse setBody(DescribeConfigSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigSettingsResponseBody getBody() {
        return this.body;
    }

}
