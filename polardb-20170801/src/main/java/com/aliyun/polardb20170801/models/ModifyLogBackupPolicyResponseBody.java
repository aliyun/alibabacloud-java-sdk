// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyLogBackupPolicyResponseBody extends TeaModel {
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
