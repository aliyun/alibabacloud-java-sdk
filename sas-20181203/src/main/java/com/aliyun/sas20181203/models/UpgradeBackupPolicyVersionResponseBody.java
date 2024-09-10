// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpgradeBackupPolicyVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9F5B8057-3E44-54DC-AC89-6814A4CD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeBackupPolicyVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeBackupPolicyVersionResponseBody self = new UpgradeBackupPolicyVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeBackupPolicyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
