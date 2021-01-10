// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutLogsinsertlogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutLogsinsertlogResponseBody body;

    public static AddLinkeBahamutLogsinsertlogResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutLogsinsertlogResponse self = new AddLinkeBahamutLogsinsertlogResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutLogsinsertlogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutLogsinsertlogResponse setBody(AddLinkeBahamutLogsinsertlogResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutLogsinsertlogResponseBody getBody() {
        return this.body;
    }

}
