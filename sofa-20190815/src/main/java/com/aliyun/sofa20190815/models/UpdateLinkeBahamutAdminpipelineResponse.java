// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminpipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutAdminpipelineResponseBody body;

    public static UpdateLinkeBahamutAdminpipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminpipelineResponse self = new UpdateLinkeBahamutAdminpipelineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminpipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutAdminpipelineResponse setBody(UpdateLinkeBahamutAdminpipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutAdminpipelineResponseBody getBody() {
        return this.body;
    }

}
