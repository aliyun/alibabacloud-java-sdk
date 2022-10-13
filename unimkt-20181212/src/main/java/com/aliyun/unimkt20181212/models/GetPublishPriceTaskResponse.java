// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetPublishPriceTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPublishPriceTaskResponseBody body;

    public static GetPublishPriceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublishPriceTaskResponse self = new GetPublishPriceTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetPublishPriceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublishPriceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublishPriceTaskResponse setBody(GetPublishPriceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublishPriceTaskResponseBody getBody() {
        return this.body;
    }

}
