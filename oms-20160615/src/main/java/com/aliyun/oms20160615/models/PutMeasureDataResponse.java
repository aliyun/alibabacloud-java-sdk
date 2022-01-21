// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class PutMeasureDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutMeasureDataResponseBody body;

    public static PutMeasureDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PutMeasureDataResponse self = new PutMeasureDataResponse();
        return TeaModel.build(map, self);
    }

    public PutMeasureDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutMeasureDataResponse setBody(PutMeasureDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PutMeasureDataResponseBody getBody() {
        return this.body;
    }

}
