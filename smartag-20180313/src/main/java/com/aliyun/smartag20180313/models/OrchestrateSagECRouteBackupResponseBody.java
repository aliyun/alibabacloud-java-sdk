// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class OrchestrateSagECRouteBackupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OrchestrateSagECRouteBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OrchestrateSagECRouteBackupResponseBody self = new OrchestrateSagECRouteBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public OrchestrateSagECRouteBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
