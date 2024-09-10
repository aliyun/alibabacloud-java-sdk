// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallBackupClientResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8eec3b63-18af-454b-8c17-aabcf7190b70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UninstallBackupClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallBackupClientResponseBody self = new UninstallBackupClientResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallBackupClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
