// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCContainerServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLDCContainerServiceResponseBody body;

    public static CreateLDCContainerServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCContainerServiceResponse self = new CreateLDCContainerServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateLDCContainerServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLDCContainerServiceResponse setBody(CreateLDCContainerServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLDCContainerServiceResponseBody getBody() {
        return this.body;
    }

}
