// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeletePhysicalConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePhysicalConnectionResponseBody self = new DeletePhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
