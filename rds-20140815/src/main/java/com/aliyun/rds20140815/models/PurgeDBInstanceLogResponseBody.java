// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PurgeDBInstanceLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PurgeDBInstanceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PurgeDBInstanceLogResponseBody self = new PurgeDBInstanceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public PurgeDBInstanceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
