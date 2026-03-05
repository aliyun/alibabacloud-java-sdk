// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppRecommendedCommoditiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppRecommendedCommoditiesResponseBody body;

    public static GetAppRecommendedCommoditiesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppRecommendedCommoditiesResponse self = new GetAppRecommendedCommoditiesResponse();
        return TeaModel.build(map, self);
    }

    public GetAppRecommendedCommoditiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppRecommendedCommoditiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppRecommendedCommoditiesResponse setBody(GetAppRecommendedCommoditiesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppRecommendedCommoditiesResponseBody getBody() {
        return this.body;
    }

}
