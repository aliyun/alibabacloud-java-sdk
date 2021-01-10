// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutAppcreaterepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutAppcreaterepoResponseBody body;

    public static CreateLinkeBahamutAppcreaterepoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutAppcreaterepoResponse self = new CreateLinkeBahamutAppcreaterepoResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutAppcreaterepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutAppcreaterepoResponse setBody(CreateLinkeBahamutAppcreaterepoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutAppcreaterepoResponseBody getBody() {
        return this.body;
    }

}
