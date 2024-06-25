// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyLogBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>345174B4-FAB3-412E-A326-BEDDA9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLogBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogBackupPolicyResponseBody self = new ModifyLogBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLogBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
