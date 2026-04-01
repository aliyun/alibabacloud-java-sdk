// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceKeyPairResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6C36770E-21AE-5689-BAA6-313DA58D5467</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCInstanceKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceKeyPairResponseBody self = new ModifyRCInstanceKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
