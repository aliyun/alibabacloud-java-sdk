// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DescribeHdMonitorRegionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHdMonitorRegionConfigResponseBody body;

    public static DescribeHdMonitorRegionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHdMonitorRegionConfigResponse self = new DescribeHdMonitorRegionConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHdMonitorRegionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHdMonitorRegionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHdMonitorRegionConfigResponse setBody(DescribeHdMonitorRegionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHdMonitorRegionConfigResponseBody getBody() {
        return this.body;
    }

}
