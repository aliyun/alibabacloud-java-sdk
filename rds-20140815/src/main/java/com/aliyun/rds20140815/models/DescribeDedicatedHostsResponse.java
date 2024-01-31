// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDedicatedHostsResponseBody body;

    public static DescribeDedicatedHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsResponse self = new DescribeDedicatedHostsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedHostsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDedicatedHostsResponse setBody(DescribeDedicatedHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostsResponseBody getBody() {
        return this.body;
    }

}
