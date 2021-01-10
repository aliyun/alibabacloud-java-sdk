// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMvnjarpipelineunfinishedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutMvnjarpipelineunfinishedResponseBody body;

    public static GetLinkeBahamutMvnjarpipelineunfinishedResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMvnjarpipelineunfinishedResponse self = new GetLinkeBahamutMvnjarpipelineunfinishedResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMvnjarpipelineunfinishedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutMvnjarpipelineunfinishedResponse setBody(GetLinkeBahamutMvnjarpipelineunfinishedResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutMvnjarpipelineunfinishedResponseBody getBody() {
        return this.body;
    }

}
