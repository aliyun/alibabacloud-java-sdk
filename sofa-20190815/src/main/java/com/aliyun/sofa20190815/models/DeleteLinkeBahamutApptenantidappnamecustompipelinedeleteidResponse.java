// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponseBody body;

    public static DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse self = new DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse setBody(DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponseBody getBody() {
        return this.body;
    }

}
