// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutAppcreateorimporttaskabortResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutAppcreateorimporttaskabortResponseBody body;

    public static CreateLinkeBahamutAppcreateorimporttaskabortResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutAppcreateorimporttaskabortResponse self = new CreateLinkeBahamutAppcreateorimporttaskabortResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutAppcreateorimporttaskabortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutAppcreateorimporttaskabortResponse setBody(CreateLinkeBahamutAppcreateorimporttaskabortResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutAppcreateorimporttaskabortResponseBody getBody() {
        return this.body;
    }

}
