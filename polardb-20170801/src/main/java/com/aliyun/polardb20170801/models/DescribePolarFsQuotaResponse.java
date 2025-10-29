// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarFsQuotaResponseBody body;

    public static DescribePolarFsQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsQuotaResponse self = new DescribePolarFsQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarFsQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarFsQuotaResponse setBody(DescribePolarFsQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarFsQuotaResponseBody getBody() {
        return this.body;
    }

}
