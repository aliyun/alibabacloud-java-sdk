// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteSavedSearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeleteSavedSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSavedSearchResponse self = new DeleteSavedSearchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSavedSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
