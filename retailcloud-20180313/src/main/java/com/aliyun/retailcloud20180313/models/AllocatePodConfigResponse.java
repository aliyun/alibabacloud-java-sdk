// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class AllocatePodConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AllocatePodConfigResponseBody body;

    public static AllocatePodConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocatePodConfigResponse self = new AllocatePodConfigResponse();
        return TeaModel.build(map, self);
    }

    public AllocatePodConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocatePodConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocatePodConfigResponse setBody(AllocatePodConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocatePodConfigResponseBody getBody() {
        return this.body;
    }

}
