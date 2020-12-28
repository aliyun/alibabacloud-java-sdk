// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMasterSlaveServerGroupsResponseBody body;

    public static DescribeMasterSlaveServerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMasterSlaveServerGroupsResponse self = new DescribeMasterSlaveServerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMasterSlaveServerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMasterSlaveServerGroupsResponse setBody(DescribeMasterSlaveServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMasterSlaveServerGroupsResponseBody getBody() {
        return this.body;
    }

}
