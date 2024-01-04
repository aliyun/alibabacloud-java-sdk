// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class BatchQueryMotionShopTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchQueryMotionShopTaskStatusResponseBody body;

    public static BatchQueryMotionShopTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryMotionShopTaskStatusResponse self = new BatchQueryMotionShopTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryMotionShopTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQueryMotionShopTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchQueryMotionShopTaskStatusResponse setBody(BatchQueryMotionShopTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQueryMotionShopTaskStatusResponseBody getBody() {
        return this.body;
    }

}
