// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallUniBackupAgentResponseBody extends TeaModel {
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
