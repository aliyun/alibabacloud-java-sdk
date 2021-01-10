// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMSDdsJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMSDdsJobResponseBody body;

    public static DeleteMSDdsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMSDdsJobResponse self = new DeleteMSDdsJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMSDdsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMSDdsJobResponse setBody(DeleteMSDdsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMSDdsJobResponseBody getBody() {
        return this.body;
    }

}
