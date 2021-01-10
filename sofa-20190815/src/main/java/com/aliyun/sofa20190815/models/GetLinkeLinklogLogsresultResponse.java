// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogLogsresultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinklogLogsresultResponseBody body;

    public static GetLinkeLinklogLogsresultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogLogsresultResponse self = new GetLinkeLinklogLogsresultResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogLogsresultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinklogLogsresultResponse setBody(GetLinkeLinklogLogsresultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinklogLogsresultResponseBody getBody() {
        return this.body;
    }

}
