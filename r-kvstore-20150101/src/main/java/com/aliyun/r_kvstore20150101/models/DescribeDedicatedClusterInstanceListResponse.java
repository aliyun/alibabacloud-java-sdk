// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDedicatedClusterInstanceListResponseBody body;

    public static DescribeDedicatedClusterInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedClusterInstanceListResponse self = new DescribeDedicatedClusterInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedClusterInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedClusterInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDedicatedClusterInstanceListResponse setBody(DescribeDedicatedClusterInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedClusterInstanceListResponseBody getBody() {
        return this.body;
    }

}
