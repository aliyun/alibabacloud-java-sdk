// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateODPInstancesResponseBody body;

    public static UpdateODPInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPInstancesResponse self = new UpdateODPInstancesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateODPInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateODPInstancesResponse setBody(UpdateODPInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateODPInstancesResponseBody getBody() {
        return this.body;
    }

}
