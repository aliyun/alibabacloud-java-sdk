// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DeleteAccessTokenResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DB4A7EA2-6FDA-5655-B067-854532FB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessTokenResponseBody self = new DeleteAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
