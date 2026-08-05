// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarFsMappingResponseBody body;

    public static DescribePolarFsMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsMappingResponse self = new DescribePolarFsMappingResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarFsMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarFsMappingResponse setBody(DescribePolarFsMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarFsMappingResponseBody getBody() {
        return this.body;
    }

}
