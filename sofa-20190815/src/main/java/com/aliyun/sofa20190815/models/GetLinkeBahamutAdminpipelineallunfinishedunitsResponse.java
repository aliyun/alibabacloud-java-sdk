// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAdminpipelineallunfinishedunitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAdminpipelineallunfinishedunitsResponseBody body;

    public static GetLinkeBahamutAdminpipelineallunfinishedunitsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAdminpipelineallunfinishedunitsResponse self = new GetLinkeBahamutAdminpipelineallunfinishedunitsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAdminpipelineallunfinishedunitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAdminpipelineallunfinishedunitsResponse setBody(GetLinkeBahamutAdminpipelineallunfinishedunitsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAdminpipelineallunfinishedunitsResponseBody getBody() {
        return this.body;
    }

}
