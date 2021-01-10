// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportLinkeBahamutIterationimportmembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportLinkeBahamutIterationimportmembersResponseBody body;

    public static ImportLinkeBahamutIterationimportmembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportLinkeBahamutIterationimportmembersResponse self = new ImportLinkeBahamutIterationimportmembersResponse();
        return TeaModel.build(map, self);
    }

    public ImportLinkeBahamutIterationimportmembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportLinkeBahamutIterationimportmembersResponse setBody(ImportLinkeBahamutIterationimportmembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportLinkeBahamutIterationimportmembersResponseBody getBody() {
        return this.body;
    }

}
