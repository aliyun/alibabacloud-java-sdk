// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloseODPInstancesPublicAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseODPInstancesPublicAccessResponseBody body;

    public static CloseODPInstancesPublicAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseODPInstancesPublicAccessResponse self = new CloseODPInstancesPublicAccessResponse();
        return TeaModel.build(map, self);
    }

    public CloseODPInstancesPublicAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseODPInstancesPublicAccessResponse setBody(CloseODPInstancesPublicAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseODPInstancesPublicAccessResponseBody getBody() {
        return this.body;
    }

}
