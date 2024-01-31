// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetDetailByUuidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAssetDetailByUuidResponseBody body;

    public static GetAssetDetailByUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssetDetailByUuidResponse self = new GetAssetDetailByUuidResponse();
        return TeaModel.build(map, self);
    }

    public GetAssetDetailByUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssetDetailByUuidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssetDetailByUuidResponse setBody(GetAssetDetailByUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssetDetailByUuidResponseBody getBody() {
        return this.body;
    }

}
