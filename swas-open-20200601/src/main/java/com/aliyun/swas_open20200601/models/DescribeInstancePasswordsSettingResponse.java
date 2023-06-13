// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInstancePasswordsSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstancePasswordsSettingResponseBody body;

    public static DescribeInstancePasswordsSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePasswordsSettingResponse self = new DescribeInstancePasswordsSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePasswordsSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstancePasswordsSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstancePasswordsSettingResponse setBody(DescribeInstancePasswordsSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstancePasswordsSettingResponseBody getBody() {
        return this.body;
    }

}
