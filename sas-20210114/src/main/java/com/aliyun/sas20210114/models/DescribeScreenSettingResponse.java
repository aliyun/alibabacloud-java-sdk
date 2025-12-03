// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenSettingResponseBody body;

    public static DescribeScreenSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenSettingResponse self = new DescribeScreenSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenSettingResponse setBody(DescribeScreenSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenSettingResponseBody getBody() {
        return this.body;
    }

}
