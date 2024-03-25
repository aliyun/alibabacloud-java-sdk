// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssObjectDetailV2ResponseBody body;

    public static DescribeOssObjectDetailV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectDetailV2Response self = new DescribeOssObjectDetailV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectDetailV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssObjectDetailV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssObjectDetailV2Response setBody(DescribeOssObjectDetailV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssObjectDetailV2ResponseBody getBody() {
        return this.body;
    }

}
