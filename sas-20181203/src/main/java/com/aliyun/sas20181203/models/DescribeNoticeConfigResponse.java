// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNoticeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNoticeConfigResponseBody body;

    public static DescribeNoticeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNoticeConfigResponse self = new DescribeNoticeConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNoticeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNoticeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNoticeConfigResponse setBody(DescribeNoticeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNoticeConfigResponseBody getBody() {
        return this.body;
    }

}
