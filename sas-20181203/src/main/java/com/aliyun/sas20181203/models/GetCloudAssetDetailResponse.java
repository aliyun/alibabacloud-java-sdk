// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudAssetDetailResponseBody body;

    public static GetCloudAssetDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetDetailResponse self = new GetCloudAssetDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudAssetDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudAssetDetailResponse setBody(GetCloudAssetDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudAssetDetailResponseBody getBody() {
        return this.body;
    }

}
