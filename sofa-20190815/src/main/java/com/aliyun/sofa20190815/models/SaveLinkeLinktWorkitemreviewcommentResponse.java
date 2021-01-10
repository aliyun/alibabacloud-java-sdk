// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeLinktWorkitemreviewcommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeLinktWorkitemreviewcommentResponseBody body;

    public static SaveLinkeLinktWorkitemreviewcommentResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeLinktWorkitemreviewcommentResponse self = new SaveLinkeLinktWorkitemreviewcommentResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeLinktWorkitemreviewcommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeLinktWorkitemreviewcommentResponse setBody(SaveLinkeLinktWorkitemreviewcommentResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeLinktWorkitemreviewcommentResponseBody getBody() {
        return this.body;
    }

}
