// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class ApproveJoinCompanyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApproveJoinCompanyResponseBody body;

    public static ApproveJoinCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveJoinCompanyResponse self = new ApproveJoinCompanyResponse();
        return TeaModel.build(map, self);
    }

    public ApproveJoinCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveJoinCompanyResponse setBody(ApproveJoinCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveJoinCompanyResponseBody getBody() {
        return this.body;
    }

}
