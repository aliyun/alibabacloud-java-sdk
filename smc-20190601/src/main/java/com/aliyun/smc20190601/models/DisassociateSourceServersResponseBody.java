// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DisassociateSourceServersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3E8B9ABB-289A-44E6-942D-8AA9E493****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisassociateSourceServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociateSourceServersResponseBody self = new DisassociateSourceServersResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociateSourceServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
