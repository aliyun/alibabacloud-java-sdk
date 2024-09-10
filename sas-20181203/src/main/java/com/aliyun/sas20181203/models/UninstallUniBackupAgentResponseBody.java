// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallUniBackupAgentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9D97AFC3-AA58-5B8F-BBC4-16D7D8AB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UninstallUniBackupAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallUniBackupAgentResponseBody self = new UninstallUniBackupAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallUniBackupAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
