// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStoreSalesVolumeTopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetStoreSalesVolumeTopResponseBody body;

    public static GetStoreSalesVolumeTopResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStoreSalesVolumeTopResponse self = new GetStoreSalesVolumeTopResponse();
        return TeaModel.build(map, self);
    }

    public GetStoreSalesVolumeTopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStoreSalesVolumeTopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStoreSalesVolumeTopResponse setBody(GetStoreSalesVolumeTopResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStoreSalesVolumeTopResponseBody getBody() {
        return this.body;
    }

}
