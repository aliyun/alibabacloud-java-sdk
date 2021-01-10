// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectTasktriggertypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectTasktriggertypeResponseBody body;

    public static ListHasInspectTasktriggertypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectTasktriggertypeResponse self = new ListHasInspectTasktriggertypeResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectTasktriggertypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectTasktriggertypeResponse setBody(ListHasInspectTasktriggertypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectTasktriggertypeResponseBody getBody() {
        return this.body;
    }

}
