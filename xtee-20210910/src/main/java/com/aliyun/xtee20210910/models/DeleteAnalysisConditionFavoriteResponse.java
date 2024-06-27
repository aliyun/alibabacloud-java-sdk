// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteAnalysisConditionFavoriteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAnalysisConditionFavoriteResponseBody body;

    public static DeleteAnalysisConditionFavoriteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAnalysisConditionFavoriteResponse self = new DeleteAnalysisConditionFavoriteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAnalysisConditionFavoriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAnalysisConditionFavoriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAnalysisConditionFavoriteResponse setBody(DeleteAnalysisConditionFavoriteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAnalysisConditionFavoriteResponseBody getBody() {
        return this.body;
    }

}
