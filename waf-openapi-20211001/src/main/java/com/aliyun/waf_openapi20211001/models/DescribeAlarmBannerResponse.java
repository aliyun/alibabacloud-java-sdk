// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAlarmBannerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlarmBannerResponseBody body;

    public static DescribeAlarmBannerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmBannerResponse self = new DescribeAlarmBannerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmBannerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlarmBannerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlarmBannerResponse setBody(DescribeAlarmBannerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlarmBannerResponseBody getBody() {
        return this.body;
    }

}
