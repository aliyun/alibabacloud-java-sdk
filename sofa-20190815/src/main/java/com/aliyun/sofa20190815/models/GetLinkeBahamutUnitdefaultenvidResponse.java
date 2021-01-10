// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUnitdefaultenvidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutUnitdefaultenvidResponseBody body;

    public static GetLinkeBahamutUnitdefaultenvidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUnitdefaultenvidResponse self = new GetLinkeBahamutUnitdefaultenvidResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUnitdefaultenvidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutUnitdefaultenvidResponse setBody(GetLinkeBahamutUnitdefaultenvidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutUnitdefaultenvidResponseBody getBody() {
        return this.body;
    }

}
