// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class TransformToPrePaidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransformToPrePaidResponseBody body;

    public static TransformToPrePaidResponse build(java.util.Map<String, ?> map) throws Exception {
        TransformToPrePaidResponse self = new TransformToPrePaidResponse();
        return TeaModel.build(map, self);
    }

    public TransformToPrePaidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransformToPrePaidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransformToPrePaidResponse setBody(TransformToPrePaidResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformToPrePaidResponseBody getBody() {
        return this.body;
    }

}
