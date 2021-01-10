// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutAppgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutAppgroupResponseBody body;

    public static CreateLinkeBahamutAppgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutAppgroupResponse self = new CreateLinkeBahamutAppgroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutAppgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutAppgroupResponse setBody(CreateLinkeBahamutAppgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutAppgroupResponseBody getBody() {
        return this.body;
    }

}
