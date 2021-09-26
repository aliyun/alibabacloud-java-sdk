// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class EditLogMaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EditLogMaskConfigResponseBody body;

    public static EditLogMaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        EditLogMaskConfigResponse self = new EditLogMaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public EditLogMaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditLogMaskConfigResponse setBody(EditLogMaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public EditLogMaskConfigResponseBody getBody() {
        return this.body;
    }

}
