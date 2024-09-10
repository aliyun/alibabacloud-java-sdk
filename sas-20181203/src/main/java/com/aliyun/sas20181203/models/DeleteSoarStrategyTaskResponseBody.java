// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSoarStrategyTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C699E4E4-F2F4-58FC-A949-457FFE59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSoarStrategyTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSoarStrategyTaskResponseBody self = new DeleteSoarStrategyTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSoarStrategyTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
