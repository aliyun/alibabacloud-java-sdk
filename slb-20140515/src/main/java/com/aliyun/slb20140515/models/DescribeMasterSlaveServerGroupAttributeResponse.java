// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMasterSlaveServerGroupAttributeResponseBody body;

    public static DescribeMasterSlaveServerGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMasterSlaveServerGroupAttributeResponse self = new DescribeMasterSlaveServerGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMasterSlaveServerGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMasterSlaveServerGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMasterSlaveServerGroupAttributeResponse setBody(DescribeMasterSlaveServerGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMasterSlaveServerGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
