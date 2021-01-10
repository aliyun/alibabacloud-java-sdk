// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsauthorizedprojectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsauthorizedprojectResponseBody body;

    public static GetLinkeBahamutVcsauthorizedprojectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsauthorizedprojectResponse self = new GetLinkeBahamutVcsauthorizedprojectResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsauthorizedprojectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsauthorizedprojectResponse setBody(GetLinkeBahamutVcsauthorizedprojectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsauthorizedprojectResponseBody getBody() {
        return this.body;
    }

}
