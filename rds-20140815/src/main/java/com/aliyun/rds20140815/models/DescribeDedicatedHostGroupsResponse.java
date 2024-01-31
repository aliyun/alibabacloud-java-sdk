// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDedicatedHostGroupsResponseBody body;

    public static DescribeDedicatedHostGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostGroupsResponse self = new DescribeDedicatedHostGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedHostGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDedicatedHostGroupsResponse setBody(DescribeDedicatedHostGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostGroupsResponseBody getBody() {
        return this.body;
    }

}
