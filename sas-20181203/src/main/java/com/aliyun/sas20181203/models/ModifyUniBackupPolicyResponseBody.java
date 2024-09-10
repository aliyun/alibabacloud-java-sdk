// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyUniBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3F6FAB39-5AF7-5B2C-A17D-16D52AE0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUniBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUniBackupPolicyResponseBody self = new ModifyUniBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUniBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
