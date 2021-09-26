// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSqlTypeKeysForRuleResponseBody extends TeaModel {
    @NameInMap("ServerData")
    public String serverData;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSqlTypeKeysForRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSqlTypeKeysForRuleResponseBody self = new ListSqlTypeKeysForRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSqlTypeKeysForRuleResponseBody setServerData(String serverData) {
        this.serverData = serverData;
        return this;
    }
    public String getServerData() {
        return this.serverData;
    }

    public ListSqlTypeKeysForRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
