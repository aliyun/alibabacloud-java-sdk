// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class SetAgentCreditQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9B353D6D-53C9-1C24-95D5-2D24596DBCF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetAgentCreditQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAgentCreditQuotaResponseBody self = new SetAgentCreditQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAgentCreditQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
