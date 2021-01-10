// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckODPInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckODPInstancesResponseBody body;

    public static CheckODPInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckODPInstancesResponse self = new CheckODPInstancesResponse();
        return TeaModel.build(map, self);
    }

    public CheckODPInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckODPInstancesResponse setBody(CheckODPInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckODPInstancesResponseBody getBody() {
        return this.body;
    }

}
