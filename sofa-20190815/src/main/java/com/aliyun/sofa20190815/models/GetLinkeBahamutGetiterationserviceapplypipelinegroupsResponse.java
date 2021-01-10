// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponseBody body;

    public static GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse self = new GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse setBody(GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponseBody getBody() {
        return this.body;
    }

}
