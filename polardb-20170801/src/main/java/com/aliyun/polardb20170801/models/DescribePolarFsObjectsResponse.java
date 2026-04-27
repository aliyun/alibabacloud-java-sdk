// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsObjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarFsObjectsResponseBody body;

    public static DescribePolarFsObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsObjectsResponse self = new DescribePolarFsObjectsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarFsObjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarFsObjectsResponse setBody(DescribePolarFsObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarFsObjectsResponseBody getBody() {
        return this.body;
    }

}
