// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetPublishCronResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPublishCronResponseBody body;

    public static GetPublishCronResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublishCronResponse self = new GetPublishCronResponse();
        return TeaModel.build(map, self);
    }

    public GetPublishCronResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublishCronResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublishCronResponse setBody(GetPublishCronResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublishCronResponseBody getBody() {
        return this.body;
    }

}
