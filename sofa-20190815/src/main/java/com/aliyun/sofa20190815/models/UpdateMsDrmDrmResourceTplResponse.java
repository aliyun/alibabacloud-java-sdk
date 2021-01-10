// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsDrmDrmResourceTplResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsDrmDrmResourceTplResponseBody body;

    public static UpdateMsDrmDrmResourceTplResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsDrmDrmResourceTplResponse self = new UpdateMsDrmDrmResourceTplResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsDrmDrmResourceTplResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsDrmDrmResourceTplResponse setBody(UpdateMsDrmDrmResourceTplResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsDrmDrmResourceTplResponseBody getBody() {
        return this.body;
    }

}
