// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class PutMeasureDataByProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutMeasureDataByProxyResponseBody body;

    public static PutMeasureDataByProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        PutMeasureDataByProxyResponse self = new PutMeasureDataByProxyResponse();
        return TeaModel.build(map, self);
    }

    public PutMeasureDataByProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutMeasureDataByProxyResponse setBody(PutMeasureDataByProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public PutMeasureDataByProxyResponseBody getBody() {
        return this.body;
    }

}
