// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsDrmDrmResourceTplResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsDrmDrmResourceTplResponseBody body;

    public static DeleteMsDrmDrmResourceTplResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsDrmDrmResourceTplResponse self = new DeleteMsDrmDrmResourceTplResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsDrmDrmResourceTplResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsDrmDrmResourceTplResponse setBody(DeleteMsDrmDrmResourceTplResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsDrmDrmResourceTplResponseBody getBody() {
        return this.body;
    }

}
