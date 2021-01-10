// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAppgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutAppgroupResponseBody body;

    public static DeleteLinkeBahamutAppgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAppgroupResponse self = new DeleteLinkeBahamutAppgroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAppgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutAppgroupResponse setBody(DeleteLinkeBahamutAppgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutAppgroupResponseBody getBody() {
        return this.body;
    }

}
