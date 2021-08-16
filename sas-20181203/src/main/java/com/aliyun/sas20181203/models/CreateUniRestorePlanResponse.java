// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUniRestorePlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUniRestorePlanResponseBody body;

    public static CreateUniRestorePlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUniRestorePlanResponse self = new CreateUniRestorePlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateUniRestorePlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUniRestorePlanResponse setBody(CreateUniRestorePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUniRestorePlanResponseBody getBody() {
        return this.body;
    }

}
