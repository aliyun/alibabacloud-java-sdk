// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceReplicationResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>76364A52-E0AB-5CC8-9818-CF1DC482C092</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBInstanceReplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceReplicationResponseBody self = new CreateDBInstanceReplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceReplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
