// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminpipelineexistediterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutAdminpipelineexistediterationResponseBody body;

    public static UpdateLinkeBahamutAdminpipelineexistediterationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminpipelineexistediterationResponse self = new UpdateLinkeBahamutAdminpipelineexistediterationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminpipelineexistediterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutAdminpipelineexistediterationResponse setBody(UpdateLinkeBahamutAdminpipelineexistediterationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutAdminpipelineexistediterationResponseBody getBody() {
        return this.body;
    }

}
