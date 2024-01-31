// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCommonOverallConfigResponseBody body;

    public static DescribeCommonOverallConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonOverallConfigResponse self = new DescribeCommonOverallConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommonOverallConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommonOverallConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommonOverallConfigResponse setBody(DescribeCommonOverallConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommonOverallConfigResponseBody getBody() {
        return this.body;
    }

}
