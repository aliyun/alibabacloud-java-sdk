// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutNotificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutNotificationResponseBody body;

    public static GetLinkeBahamutNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutNotificationResponse self = new GetLinkeBahamutNotificationResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutNotificationResponse setBody(GetLinkeBahamutNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutNotificationResponseBody getBody() {
        return this.body;
    }

}
