// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutLogsgetlogsbyuserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutLogsgetlogsbyuserResponseBody body;

    public static GetLinkeBahamutLogsgetlogsbyuserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutLogsgetlogsbyuserResponse self = new GetLinkeBahamutLogsgetlogsbyuserResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutLogsgetlogsbyuserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutLogsgetlogsbyuserResponse setBody(GetLinkeBahamutLogsgetlogsbyuserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutLogsgetlogsbyuserResponseBody getBody() {
        return this.body;
    }

}
