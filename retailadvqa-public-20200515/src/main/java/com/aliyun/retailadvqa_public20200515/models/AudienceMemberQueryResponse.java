// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class AudienceMemberQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AudienceMemberQueryResponseBody body;

    public static AudienceMemberQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        AudienceMemberQueryResponse self = new AudienceMemberQueryResponse();
        return TeaModel.build(map, self);
    }

    public AudienceMemberQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AudienceMemberQueryResponse setBody(AudienceMemberQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public AudienceMemberQueryResponseBody getBody() {
        return this.body;
    }

}
