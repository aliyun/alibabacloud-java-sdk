// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarFsResponseBody body;

    public static DescribePolarFsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsResponse self = new DescribePolarFsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarFsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarFsResponse setBody(DescribePolarFsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarFsResponseBody getBody() {
        return this.body;
    }

}
