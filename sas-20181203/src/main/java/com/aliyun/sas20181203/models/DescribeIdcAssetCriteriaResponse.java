// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIdcAssetCriteriaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIdcAssetCriteriaResponseBody body;

    public static DescribeIdcAssetCriteriaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdcAssetCriteriaResponse self = new DescribeIdcAssetCriteriaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIdcAssetCriteriaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIdcAssetCriteriaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIdcAssetCriteriaResponse setBody(DescribeIdcAssetCriteriaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIdcAssetCriteriaResponseBody getBody() {
        return this.body;
    }

}
