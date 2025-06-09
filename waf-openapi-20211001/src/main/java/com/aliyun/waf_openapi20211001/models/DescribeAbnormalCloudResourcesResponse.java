// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAbnormalCloudResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAbnormalCloudResourcesResponseBody body;

    public static DescribeAbnormalCloudResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAbnormalCloudResourcesResponse self = new DescribeAbnormalCloudResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAbnormalCloudResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAbnormalCloudResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAbnormalCloudResourcesResponse setBody(DescribeAbnormalCloudResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAbnormalCloudResourcesResponseBody getBody() {
        return this.body;
    }

}
