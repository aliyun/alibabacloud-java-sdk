// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeMasterSlaveServerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMasterSlaveServerGroupsResponse setBody(DescribeMasterSlaveServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMasterSlaveServerGroupsResponseBody getBody() {
        return this.body;
    }

}
