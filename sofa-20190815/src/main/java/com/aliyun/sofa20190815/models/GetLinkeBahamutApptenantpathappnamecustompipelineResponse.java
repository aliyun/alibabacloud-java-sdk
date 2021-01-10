// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutApptenantpathappnamecustompipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody body;

    public static GetLinkeBahamutApptenantpathappnamecustompipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutApptenantpathappnamecustompipelineResponse self = new GetLinkeBahamutApptenantpathappnamecustompipelineResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineResponse setBody(GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody getBody() {
        return this.body;
    }

}
