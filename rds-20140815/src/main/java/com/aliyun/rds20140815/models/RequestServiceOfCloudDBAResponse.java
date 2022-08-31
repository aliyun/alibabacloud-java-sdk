// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RequestServiceOfCloudDBAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RequestServiceOfCloudDBAResponseBody body;

    public static RequestServiceOfCloudDBAResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestServiceOfCloudDBAResponse self = new RequestServiceOfCloudDBAResponse();
        return TeaModel.build(map, self);
    }

    public RequestServiceOfCloudDBAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestServiceOfCloudDBAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestServiceOfCloudDBAResponse setBody(RequestServiceOfCloudDBAResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestServiceOfCloudDBAResponseBody getBody() {
        return this.body;
    }

}
