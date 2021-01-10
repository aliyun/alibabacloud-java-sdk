// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeUisNetworkInterfacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUisNetworkInterfacesResponseBody body;

    public static DescribeUisNetworkInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUisNetworkInterfacesResponse self = new DescribeUisNetworkInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUisNetworkInterfacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUisNetworkInterfacesResponse setBody(DescribeUisNetworkInterfacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUisNetworkInterfacesResponseBody getBody() {
        return this.body;
    }

}
