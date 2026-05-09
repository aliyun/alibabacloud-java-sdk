// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateGdnStandbyMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGdnStandbyMemberResponseBody body;

    public static CreateGdnStandbyMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGdnStandbyMemberResponse self = new CreateGdnStandbyMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateGdnStandbyMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGdnStandbyMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGdnStandbyMemberResponse setBody(CreateGdnStandbyMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGdnStandbyMemberResponseBody getBody() {
        return this.body;
    }

}
