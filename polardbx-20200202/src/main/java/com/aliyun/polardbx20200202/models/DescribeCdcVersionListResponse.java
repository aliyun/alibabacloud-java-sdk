// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCdcVersionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdcVersionListResponseBody body;

    public static DescribeCdcVersionListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdcVersionListResponse self = new DescribeCdcVersionListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdcVersionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdcVersionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdcVersionListResponse setBody(DescribeCdcVersionListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdcVersionListResponseBody getBody() {
        return this.body;
    }

}
