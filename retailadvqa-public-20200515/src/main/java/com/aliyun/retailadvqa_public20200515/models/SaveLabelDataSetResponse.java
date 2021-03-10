// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SaveLabelDataSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLabelDataSetResponseBody body;

    public static SaveLabelDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLabelDataSetResponse self = new SaveLabelDataSetResponse();
        return TeaModel.build(map, self);
    }

    public SaveLabelDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLabelDataSetResponse setBody(SaveLabelDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLabelDataSetResponseBody getBody() {
        return this.body;
    }

}
