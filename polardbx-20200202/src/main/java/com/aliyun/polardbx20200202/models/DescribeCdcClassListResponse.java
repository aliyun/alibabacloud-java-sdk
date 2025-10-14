// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCdcClassListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdcClassListResponseBody body;

    public static DescribeCdcClassListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdcClassListResponse self = new DescribeCdcClassListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdcClassListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdcClassListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdcClassListResponse setBody(DescribeCdcClassListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdcClassListResponseBody getBody() {
        return this.body;
    }

}
