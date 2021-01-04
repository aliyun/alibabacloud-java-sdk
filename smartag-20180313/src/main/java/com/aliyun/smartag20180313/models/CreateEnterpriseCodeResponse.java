// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateEnterpriseCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEnterpriseCodeResponseBody body;

    public static CreateEnterpriseCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseCodeResponse self = new CreateEnterpriseCodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnterpriseCodeResponse setBody(CreateEnterpriseCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnterpriseCodeResponseBody getBody() {
        return this.body;
    }

}
