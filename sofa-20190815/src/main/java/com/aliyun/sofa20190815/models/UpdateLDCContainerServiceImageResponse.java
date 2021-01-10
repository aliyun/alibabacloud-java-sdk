// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCContainerServiceImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCContainerServiceImageResponseBody body;

    public static UpdateLDCContainerServiceImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCContainerServiceImageResponse self = new UpdateLDCContainerServiceImageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCContainerServiceImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCContainerServiceImageResponse setBody(UpdateLDCContainerServiceImageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCContainerServiceImageResponseBody getBody() {
        return this.body;
    }

}
