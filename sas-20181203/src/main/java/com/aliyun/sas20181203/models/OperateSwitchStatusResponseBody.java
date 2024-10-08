// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSwitchStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8AE9D3DA-406B-51FA-AA1C-89440C1459BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateSwitchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateSwitchStatusResponseBody self = new OperateSwitchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateSwitchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
