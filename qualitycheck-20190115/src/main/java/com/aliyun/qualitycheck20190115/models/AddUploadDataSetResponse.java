// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddUploadDataSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddUploadDataSetResponseBody body;

    public static AddUploadDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUploadDataSetResponse self = new AddUploadDataSetResponse();
        return TeaModel.build(map, self);
    }

    public AddUploadDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUploadDataSetResponse setBody(AddUploadDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUploadDataSetResponseBody getBody() {
        return this.body;
    }

}
