// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class PlanPortalGetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PlanPortalGetResponseBody body;

    public static PlanPortalGetResponse build(java.util.Map<String, ?> map) throws Exception {
        PlanPortalGetResponse self = new PlanPortalGetResponse();
        return TeaModel.build(map, self);
    }

    public PlanPortalGetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PlanPortalGetResponse setBody(PlanPortalGetResponseBody body) {
        this.body = body;
        return this;
    }
    public PlanPortalGetResponseBody getBody() {
        return this.body;
    }

}
