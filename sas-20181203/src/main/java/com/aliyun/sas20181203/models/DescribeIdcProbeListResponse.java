// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIdcProbeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIdcProbeListResponseBody body;

    public static DescribeIdcProbeListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdcProbeListResponse self = new DescribeIdcProbeListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIdcProbeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIdcProbeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIdcProbeListResponse setBody(DescribeIdcProbeListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIdcProbeListResponseBody getBody() {
        return this.body;
    }

}
