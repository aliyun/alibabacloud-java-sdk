// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class CreateNetworkReachableAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNetworkReachableAnalysisResponseBody body;

    public static CreateNetworkReachableAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkReachableAnalysisResponse self = new CreateNetworkReachableAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkReachableAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkReachableAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkReachableAnalysisResponse setBody(CreateNetworkReachableAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkReachableAnalysisResponseBody getBody() {
        return this.body;
    }

}
