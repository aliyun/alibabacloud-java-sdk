// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNetworkPathResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPathResponseBody self = new DeleteNetworkPathResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
