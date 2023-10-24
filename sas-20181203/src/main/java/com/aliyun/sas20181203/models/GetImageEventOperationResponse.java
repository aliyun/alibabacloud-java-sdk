// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetImageEventOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetImageEventOperationResponseBody body;

    public static GetImageEventOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageEventOperationResponse self = new GetImageEventOperationResponse();
        return TeaModel.build(map, self);
    }

    public GetImageEventOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageEventOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageEventOperationResponse setBody(GetImageEventOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageEventOperationResponseBody getBody() {
        return this.body;
    }

}
