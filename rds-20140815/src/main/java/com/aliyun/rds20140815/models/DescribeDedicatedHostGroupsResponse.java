// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDedicatedHostGroupsResponse setBody(DescribeDedicatedHostGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostGroupsResponseBody getBody() {
        return this.body;
    }

}
