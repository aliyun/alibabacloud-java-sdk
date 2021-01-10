// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OpenODPInstancesPublicAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenODPInstancesPublicAccessResponseBody body;

    public static OpenODPInstancesPublicAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenODPInstancesPublicAccessResponse self = new OpenODPInstancesPublicAccessResponse();
        return TeaModel.build(map, self);
    }

    public OpenODPInstancesPublicAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenODPInstancesPublicAccessResponse setBody(OpenODPInstancesPublicAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenODPInstancesPublicAccessResponseBody getBody() {
        return this.body;
    }

}
