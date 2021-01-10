// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCContainerServiceReplicasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCContainerServiceReplicasResponseBody body;

    public static UpdateLDCContainerServiceReplicasResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCContainerServiceReplicasResponse self = new UpdateLDCContainerServiceReplicasResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCContainerServiceReplicasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCContainerServiceReplicasResponse setBody(UpdateLDCContainerServiceReplicasResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCContainerServiceReplicasResponseBody getBody() {
        return this.body;
    }

}
