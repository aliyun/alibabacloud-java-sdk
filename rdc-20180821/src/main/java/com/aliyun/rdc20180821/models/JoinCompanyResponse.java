// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class JoinCompanyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public JoinCompanyResponseBody body;

    public static JoinCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinCompanyResponse self = new JoinCompanyResponse();
        return TeaModel.build(map, self);
    }

    public JoinCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinCompanyResponse setBody(JoinCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinCompanyResponseBody getBody() {
        return this.body;
    }

}
