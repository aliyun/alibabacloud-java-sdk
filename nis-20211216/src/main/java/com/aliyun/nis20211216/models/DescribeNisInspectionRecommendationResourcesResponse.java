// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionRecommendationResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNisInspectionRecommendationResourcesResponseBody body;

    public static DescribeNisInspectionRecommendationResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionRecommendationResourcesResponse self = new DescribeNisInspectionRecommendationResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionRecommendationResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNisInspectionRecommendationResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNisInspectionRecommendationResourcesResponse setBody(DescribeNisInspectionRecommendationResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNisInspectionRecommendationResourcesResponseBody getBody() {
        return this.body;
    }

}
