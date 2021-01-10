// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPaasgetapplyserverurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPaasgetapplyserverurlResponseBody body;

    public static GetLinkeBahamutPaasgetapplyserverurlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPaasgetapplyserverurlResponse self = new GetLinkeBahamutPaasgetapplyserverurlResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPaasgetapplyserverurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPaasgetapplyserverurlResponse setBody(GetLinkeBahamutPaasgetapplyserverurlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPaasgetapplyserverurlResponseBody getBody() {
        return this.body;
    }

}
