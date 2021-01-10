// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReleaseLinkeBahamutAdminpipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseLinkeBahamutAdminpipelineResponseBody body;

    public static ReleaseLinkeBahamutAdminpipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLinkeBahamutAdminpipelineResponse self = new ReleaseLinkeBahamutAdminpipelineResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseLinkeBahamutAdminpipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseLinkeBahamutAdminpipelineResponse setBody(ReleaseLinkeBahamutAdminpipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseLinkeBahamutAdminpipelineResponseBody getBody() {
        return this.body;
    }

}
