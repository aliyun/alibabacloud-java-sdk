// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasBaselineUserappgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasBaselineUserappgroupResponseBody body;

    public static CreateHasBaselineUserappgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasBaselineUserappgroupResponse self = new CreateHasBaselineUserappgroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasBaselineUserappgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasBaselineUserappgroupResponse setBody(CreateHasBaselineUserappgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasBaselineUserappgroupResponseBody getBody() {
        return this.body;
    }

}
