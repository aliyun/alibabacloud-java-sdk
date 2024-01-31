// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudAssetSummaryResponseBody body;

    public static GetCloudAssetSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetSummaryResponse self = new GetCloudAssetSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudAssetSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudAssetSummaryResponse setBody(GetCloudAssetSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudAssetSummaryResponseBody getBody() {
        return this.body;
    }

}
