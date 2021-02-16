// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLExplorerPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SQLCollectorStatus")
    public String SQLCollectorStatus;

    public static DescribeSQLExplorerPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLExplorerPolicyResponseBody self = new DescribeSQLExplorerPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLExplorerPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLExplorerPolicyResponseBody setSQLCollectorStatus(String SQLCollectorStatus) {
        this.SQLCollectorStatus = SQLCollectorStatus;
        return this;
    }
    public String getSQLCollectorStatus() {
        return this.SQLCollectorStatus;
    }

}
