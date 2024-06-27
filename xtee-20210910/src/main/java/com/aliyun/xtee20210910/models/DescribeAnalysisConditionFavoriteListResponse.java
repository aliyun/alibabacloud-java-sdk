// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAnalysisConditionFavoriteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAnalysisConditionFavoriteListResponseBody body;

    public static DescribeAnalysisConditionFavoriteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalysisConditionFavoriteListResponse self = new DescribeAnalysisConditionFavoriteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnalysisConditionFavoriteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnalysisConditionFavoriteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAnalysisConditionFavoriteListResponse setBody(DescribeAnalysisConditionFavoriteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnalysisConditionFavoriteListResponseBody getBody() {
        return this.body;
    }

}
