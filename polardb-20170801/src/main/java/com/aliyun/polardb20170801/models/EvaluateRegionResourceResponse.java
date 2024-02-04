// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EvaluateRegionResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EvaluateRegionResourceResponseBody body;

    public static EvaluateRegionResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        EvaluateRegionResourceResponse self = new EvaluateRegionResourceResponse();
        return TeaModel.build(map, self);
    }

    public EvaluateRegionResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EvaluateRegionResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EvaluateRegionResourceResponse setBody(EvaluateRegionResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateRegionResourceResponseBody getBody() {
        return this.body;
    }

}
