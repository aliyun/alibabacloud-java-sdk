// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutVcsmergerequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutVcsmergerequestResponseBody body;

    public static CreateLinkeBahamutVcsmergerequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutVcsmergerequestResponse self = new CreateLinkeBahamutVcsmergerequestResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutVcsmergerequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutVcsmergerequestResponse setBody(CreateLinkeBahamutVcsmergerequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutVcsmergerequestResponseBody getBody() {
        return this.body;
    }

}
