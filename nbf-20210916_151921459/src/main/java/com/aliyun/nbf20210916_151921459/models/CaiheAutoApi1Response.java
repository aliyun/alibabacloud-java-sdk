// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210916_151921459.models;

import com.aliyun.tea.*;

public class CaiheAutoApi1Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CaiheAutoApi1ResponseBody body;

    public static CaiheAutoApi1Response build(java.util.Map<String, ?> map) throws Exception {
        CaiheAutoApi1Response self = new CaiheAutoApi1Response();
        return TeaModel.build(map, self);
    }

    public CaiheAutoApi1Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CaiheAutoApi1Response setBody(CaiheAutoApi1ResponseBody body) {
        this.body = body;
        return this;
    }
    public CaiheAutoApi1ResponseBody getBody() {
        return this.body;
    }

}
