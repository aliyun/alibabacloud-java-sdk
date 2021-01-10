// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAdminpipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutAdminpipelineResponseBody body;

    public static DeleteLinkeBahamutAdminpipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAdminpipelineResponse self = new DeleteLinkeBahamutAdminpipelineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAdminpipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutAdminpipelineResponse setBody(DeleteLinkeBahamutAdminpipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutAdminpipelineResponseBody getBody() {
        return this.body;
    }

}
