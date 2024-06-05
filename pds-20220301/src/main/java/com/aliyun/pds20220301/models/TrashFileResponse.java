// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class TrashFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrashFileResponseBody body;

    public static TrashFileResponse build(java.util.Map<String, ?> map) throws Exception {
        TrashFileResponse self = new TrashFileResponse();
        return TeaModel.build(map, self);
    }

    public TrashFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrashFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrashFileResponse setBody(TrashFileResponseBody body) {
        this.body = body;
        return this;
    }
    public TrashFileResponseBody getBody() {
        return this.body;
    }

}
