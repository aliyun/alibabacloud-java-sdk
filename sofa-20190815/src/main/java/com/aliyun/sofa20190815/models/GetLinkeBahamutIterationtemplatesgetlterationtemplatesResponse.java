// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody body;

    public static GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse self = new GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse setBody(GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody getBody() {
        return this.body;
    }

}
