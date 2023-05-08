// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallBackupClientResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static InstallBackupClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallBackupClientResponseBody self = new InstallBackupClientResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallBackupClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
