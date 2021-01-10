// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutVcsgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutVcsgroupResponseBody body;

    public static CreateLinkeBahamutVcsgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutVcsgroupResponse self = new CreateLinkeBahamutVcsgroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutVcsgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutVcsgroupResponse setBody(CreateLinkeBahamutVcsgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutVcsgroupResponseBody getBody() {
        return this.body;
    }

}
