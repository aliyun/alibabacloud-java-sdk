// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetlterationtabnumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationgetlterationtabnumResponseBody body;

    public static GetLinkeBahamutIterationgetlterationtabnumResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetlterationtabnumResponse self = new GetLinkeBahamutIterationgetlterationtabnumResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetlterationtabnumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationgetlterationtabnumResponse setBody(GetLinkeBahamutIterationgetlterationtabnumResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationgetlterationtabnumResponseBody getBody() {
        return this.body;
    }

}
