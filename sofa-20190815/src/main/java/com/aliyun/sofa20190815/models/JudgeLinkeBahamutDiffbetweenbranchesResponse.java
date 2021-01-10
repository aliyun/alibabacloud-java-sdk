// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class JudgeLinkeBahamutDiffbetweenbranchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public JudgeLinkeBahamutDiffbetweenbranchesResponseBody body;

    public static JudgeLinkeBahamutDiffbetweenbranchesResponse build(java.util.Map<String, ?> map) throws Exception {
        JudgeLinkeBahamutDiffbetweenbranchesResponse self = new JudgeLinkeBahamutDiffbetweenbranchesResponse();
        return TeaModel.build(map, self);
    }

    public JudgeLinkeBahamutDiffbetweenbranchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JudgeLinkeBahamutDiffbetweenbranchesResponse setBody(JudgeLinkeBahamutDiffbetweenbranchesResponseBody body) {
        this.body = body;
        return this;
    }
    public JudgeLinkeBahamutDiffbetweenbranchesResponseBody getBody() {
        return this.body;
    }

}
