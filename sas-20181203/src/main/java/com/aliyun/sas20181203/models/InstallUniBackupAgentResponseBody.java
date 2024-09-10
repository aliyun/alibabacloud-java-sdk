// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallUniBackupAgentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>53ACA55D-0325-5056-A72D-D0EC0B9C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InstallUniBackupAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallUniBackupAgentResponseBody self = new InstallUniBackupAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallUniBackupAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
