// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class CreateEnterpriseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEnterpriseResponseBody body;

    public static CreateEnterpriseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseResponse self = new CreateEnterpriseResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnterpriseResponse setBody(CreateEnterpriseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnterpriseResponseBody getBody() {
        return this.body;
    }

}
