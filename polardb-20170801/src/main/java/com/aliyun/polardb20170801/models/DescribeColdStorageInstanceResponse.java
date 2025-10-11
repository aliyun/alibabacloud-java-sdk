// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeColdStorageInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeColdStorageInstanceResponseBody body;

    public static DescribeColdStorageInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeColdStorageInstanceResponse self = new DescribeColdStorageInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeColdStorageInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeColdStorageInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeColdStorageInstanceResponse setBody(DescribeColdStorageInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeColdStorageInstanceResponseBody getBody() {
        return this.body;
    }

}
