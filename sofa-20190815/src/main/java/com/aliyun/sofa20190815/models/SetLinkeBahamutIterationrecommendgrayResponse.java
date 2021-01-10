// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutIterationrecommendgrayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLinkeBahamutIterationrecommendgrayResponseBody body;

    public static SetLinkeBahamutIterationrecommendgrayResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutIterationrecommendgrayResponse self = new SetLinkeBahamutIterationrecommendgrayResponse();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutIterationrecommendgrayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLinkeBahamutIterationrecommendgrayResponse setBody(SetLinkeBahamutIterationrecommendgrayResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLinkeBahamutIterationrecommendgrayResponseBody getBody() {
        return this.body;
    }

}
