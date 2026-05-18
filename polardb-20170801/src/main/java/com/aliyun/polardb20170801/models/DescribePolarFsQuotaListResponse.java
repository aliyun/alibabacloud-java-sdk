// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsQuotaListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarFsQuotaListResponseBody body;

    public static DescribePolarFsQuotaListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsQuotaListResponse self = new DescribePolarFsQuotaListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsQuotaListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarFsQuotaListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarFsQuotaListResponse setBody(DescribePolarFsQuotaListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarFsQuotaListResponseBody getBody() {
        return this.body;
    }

}
