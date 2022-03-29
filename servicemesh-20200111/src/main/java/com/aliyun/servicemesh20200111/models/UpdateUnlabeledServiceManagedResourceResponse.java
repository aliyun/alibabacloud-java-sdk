// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateUnlabeledServiceManagedResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUnlabeledServiceManagedResourceResponseBody body;

    public static UpdateUnlabeledServiceManagedResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUnlabeledServiceManagedResourceResponse self = new UpdateUnlabeledServiceManagedResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUnlabeledServiceManagedResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUnlabeledServiceManagedResourceResponse setBody(UpdateUnlabeledServiceManagedResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUnlabeledServiceManagedResourceResponseBody getBody() {
        return this.body;
    }

}
