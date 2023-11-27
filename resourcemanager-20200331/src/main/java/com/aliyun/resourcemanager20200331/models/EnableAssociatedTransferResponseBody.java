// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class EnableAssociatedTransferResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableAssociatedTransferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAssociatedTransferResponseBody self = new EnableAssociatedTransferResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAssociatedTransferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
