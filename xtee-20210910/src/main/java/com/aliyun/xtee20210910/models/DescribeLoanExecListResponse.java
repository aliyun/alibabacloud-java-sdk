// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeLoanExecListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLoanExecListResponseBody body;

    public static DescribeLoanExecListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoanExecListResponse self = new DescribeLoanExecListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoanExecListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoanExecListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoanExecListResponse setBody(DescribeLoanExecListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoanExecListResponseBody getBody() {
        return this.body;
    }

}
