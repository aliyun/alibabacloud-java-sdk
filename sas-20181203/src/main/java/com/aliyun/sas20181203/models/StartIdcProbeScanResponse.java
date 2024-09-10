// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartIdcProbeScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartIdcProbeScanResponseBody body;

    public static StartIdcProbeScanResponse build(java.util.Map<String, ?> map) throws Exception {
        StartIdcProbeScanResponse self = new StartIdcProbeScanResponse();
        return TeaModel.build(map, self);
    }

    public StartIdcProbeScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartIdcProbeScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartIdcProbeScanResponse setBody(StartIdcProbeScanResponseBody body) {
        this.body = body;
        return this;
    }
    public StartIdcProbeScanResponseBody getBody() {
        return this.body;
    }

}
