// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAnalysisConditionFavoriteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAnalysisConditionFavoriteResponseBody body;

    public static CreateAnalysisConditionFavoriteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAnalysisConditionFavoriteResponse self = new CreateAnalysisConditionFavoriteResponse();
        return TeaModel.build(map, self);
    }

    public CreateAnalysisConditionFavoriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAnalysisConditionFavoriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAnalysisConditionFavoriteResponse setBody(CreateAnalysisConditionFavoriteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAnalysisConditionFavoriteResponseBody getBody() {
        return this.body;
    }

}
