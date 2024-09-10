// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserSettingResponseBody body;

    public static DescribeUserSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserSettingResponse self = new DescribeUserSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserSettingResponse setBody(DescribeUserSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserSettingResponseBody getBody() {
        return this.body;
    }

}
