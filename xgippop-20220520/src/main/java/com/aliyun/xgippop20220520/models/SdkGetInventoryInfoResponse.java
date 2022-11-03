// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SdkGetInventoryInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SdkGetInventoryInfoResponseBody body;

    public static SdkGetInventoryInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SdkGetInventoryInfoResponse self = new SdkGetInventoryInfoResponse();
        return TeaModel.build(map, self);
    }

    public SdkGetInventoryInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdkGetInventoryInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdkGetInventoryInfoResponse setBody(SdkGetInventoryInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SdkGetInventoryInfoResponseBody getBody() {
        return this.body;
    }

}
