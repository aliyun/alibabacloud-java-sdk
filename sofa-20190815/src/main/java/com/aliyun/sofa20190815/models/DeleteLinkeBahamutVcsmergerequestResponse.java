// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutVcsmergerequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutVcsmergerequestResponseBody body;

    public static DeleteLinkeBahamutVcsmergerequestResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutVcsmergerequestResponse self = new DeleteLinkeBahamutVcsmergerequestResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutVcsmergerequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutVcsmergerequestResponse setBody(DeleteLinkeBahamutVcsmergerequestResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutVcsmergerequestResponseBody getBody() {
        return this.body;
    }

}
