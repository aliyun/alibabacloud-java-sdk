// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class JudgeLinkeBahamutAdminResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public JudgeLinkeBahamutAdminResponseBody body;

    public static JudgeLinkeBahamutAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        JudgeLinkeBahamutAdminResponse self = new JudgeLinkeBahamutAdminResponse();
        return TeaModel.build(map, self);
    }

    public JudgeLinkeBahamutAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JudgeLinkeBahamutAdminResponse setBody(JudgeLinkeBahamutAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public JudgeLinkeBahamutAdminResponseBody getBody() {
        return this.body;
    }

}
