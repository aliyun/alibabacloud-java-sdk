// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetiterationmrpipelinegroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody body;

    public static GetLinkeBahamutGetiterationmrpipelinegroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetiterationmrpipelinegroupsResponse self = new GetLinkeBahamutGetiterationmrpipelinegroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsResponse setBody(GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody getBody() {
        return this.body;
    }

}
