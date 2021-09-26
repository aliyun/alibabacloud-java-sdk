// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class AssociateDbToRuleResponseBody extends TeaModel {
    @NameInMap("ServerData")
    public String serverData;

    @NameInMap("RequestId")
    public String requestId;

    public static AssociateDbToRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateDbToRuleResponseBody self = new AssociateDbToRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateDbToRuleResponseBody setServerData(String serverData) {
        this.serverData = serverData;
        return this;
    }
    public String getServerData() {
        return this.serverData;
    }

    public AssociateDbToRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
