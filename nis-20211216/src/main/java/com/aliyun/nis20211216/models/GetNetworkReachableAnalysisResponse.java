// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNetworkReachableAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNetworkReachableAnalysisResponseBody body;

    public static GetNetworkReachableAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkReachableAnalysisResponse self = new GetNetworkReachableAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkReachableAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetworkReachableAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNetworkReachableAnalysisResponse setBody(GetNetworkReachableAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetworkReachableAnalysisResponseBody getBody() {
        return this.body;
    }

}
