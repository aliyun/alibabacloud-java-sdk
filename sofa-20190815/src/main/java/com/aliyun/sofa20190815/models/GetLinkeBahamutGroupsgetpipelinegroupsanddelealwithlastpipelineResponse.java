// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponseBody body;

    public static GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse self = new GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse setBody(GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponseBody getBody() {
        return this.body;
    }

}
