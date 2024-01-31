// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetCriteriaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudAssetCriteriaResponseBody body;

    public static GetCloudAssetCriteriaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetCriteriaResponse self = new GetCloudAssetCriteriaResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetCriteriaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudAssetCriteriaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudAssetCriteriaResponse setBody(GetCloudAssetCriteriaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudAssetCriteriaResponseBody getBody() {
        return this.body;
    }

}
