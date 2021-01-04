// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagECRouteBackupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagECRouteBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagECRouteBackupResponseBody self = new ModifySagECRouteBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagECRouteBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
