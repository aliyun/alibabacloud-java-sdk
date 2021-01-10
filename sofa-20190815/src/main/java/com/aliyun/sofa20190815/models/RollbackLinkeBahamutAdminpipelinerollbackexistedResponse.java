// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RollbackLinkeBahamutAdminpipelinerollbackexistedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RollbackLinkeBahamutAdminpipelinerollbackexistedResponseBody body;

    public static RollbackLinkeBahamutAdminpipelinerollbackexistedResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackLinkeBahamutAdminpipelinerollbackexistedResponse self = new RollbackLinkeBahamutAdminpipelinerollbackexistedResponse();
        return TeaModel.build(map, self);
    }

    public RollbackLinkeBahamutAdminpipelinerollbackexistedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackLinkeBahamutAdminpipelinerollbackexistedResponse setBody(RollbackLinkeBahamutAdminpipelinerollbackexistedResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackLinkeBahamutAdminpipelinerollbackexistedResponseBody getBody() {
        return this.body;
    }

}
