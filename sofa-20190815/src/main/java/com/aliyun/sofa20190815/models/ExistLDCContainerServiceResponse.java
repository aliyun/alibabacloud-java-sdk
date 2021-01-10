// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExistLDCContainerServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExistLDCContainerServiceResponseBody body;

    public static ExistLDCContainerServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistLDCContainerServiceResponse self = new ExistLDCContainerServiceResponse();
        return TeaModel.build(map, self);
    }

    public ExistLDCContainerServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExistLDCContainerServiceResponse setBody(ExistLDCContainerServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ExistLDCContainerServiceResponseBody getBody() {
        return this.body;
    }

}
