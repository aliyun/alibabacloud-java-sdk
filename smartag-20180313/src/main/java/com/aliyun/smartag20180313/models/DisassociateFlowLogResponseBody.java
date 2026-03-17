// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DisassociateFlowLogResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DD864F79-FDAC-4909-AFAF-84D1DCAF30A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisassociateFlowLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociateFlowLogResponseBody self = new DisassociateFlowLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociateFlowLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
