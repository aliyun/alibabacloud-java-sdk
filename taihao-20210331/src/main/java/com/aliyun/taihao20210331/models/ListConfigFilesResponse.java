// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfigFilesResponseBody body;

    public static ListConfigFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigFilesResponse self = new ListConfigFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigFilesResponse setBody(ListConfigFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigFilesResponseBody getBody() {
        return this.body;
    }

}
