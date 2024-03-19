// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UploadRecommendationDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadRecommendationDataResponseBody body;

    public static UploadRecommendationDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadRecommendationDataResponse self = new UploadRecommendationDataResponse();
        return TeaModel.build(map, self);
    }

    public UploadRecommendationDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadRecommendationDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadRecommendationDataResponse setBody(UploadRecommendationDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadRecommendationDataResponseBody getBody() {
        return this.body;
    }

}
