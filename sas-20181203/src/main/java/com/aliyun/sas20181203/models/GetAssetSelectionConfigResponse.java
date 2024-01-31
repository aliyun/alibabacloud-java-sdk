// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetSelectionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAssetSelectionConfigResponseBody body;

    public static GetAssetSelectionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssetSelectionConfigResponse self = new GetAssetSelectionConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAssetSelectionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssetSelectionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssetSelectionConfigResponse setBody(GetAssetSelectionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssetSelectionConfigResponseBody getBody() {
        return this.body;
    }

}
