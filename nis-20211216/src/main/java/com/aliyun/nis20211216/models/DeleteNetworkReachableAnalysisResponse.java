// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNetworkReachableAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetworkReachableAnalysisResponseBody body;

    public static DeleteNetworkReachableAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkReachableAnalysisResponse self = new DeleteNetworkReachableAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkReachableAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkReachableAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkReachableAnalysisResponse setBody(DeleteNetworkReachableAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkReachableAnalysisResponseBody getBody() {
        return this.body;
    }

}
