// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateAnalysisConditionFavoriteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAnalysisConditionFavoriteResponseBody body;

    public static UpdateAnalysisConditionFavoriteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAnalysisConditionFavoriteResponse self = new UpdateAnalysisConditionFavoriteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAnalysisConditionFavoriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAnalysisConditionFavoriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAnalysisConditionFavoriteResponse setBody(UpdateAnalysisConditionFavoriteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAnalysisConditionFavoriteResponseBody getBody() {
        return this.body;
    }

}
