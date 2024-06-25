// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhitelistResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD86******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterAccessWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAccessWhitelistResponseBody self = new ModifyDBClusterAccessWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAccessWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
