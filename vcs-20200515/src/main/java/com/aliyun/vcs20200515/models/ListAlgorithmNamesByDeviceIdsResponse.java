// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListAlgorithmNamesByDeviceIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlgorithmNamesByDeviceIdsResponseBody body;

    public static ListAlgorithmNamesByDeviceIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlgorithmNamesByDeviceIdsResponse self = new ListAlgorithmNamesByDeviceIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlgorithmNamesByDeviceIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlgorithmNamesByDeviceIdsResponse setBody(ListAlgorithmNamesByDeviceIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlgorithmNamesByDeviceIdsResponseBody getBody() {
        return this.body;
    }

}
