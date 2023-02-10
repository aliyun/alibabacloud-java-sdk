// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallBackupClientResponseBody extends TeaModel {
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
