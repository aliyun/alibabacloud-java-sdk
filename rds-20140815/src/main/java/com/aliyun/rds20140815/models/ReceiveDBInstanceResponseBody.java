// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReceiveDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the disaster recovery instance after the switchover.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-tr2whku*****</p>
     */
    @NameInMap("GuardDBInstanceId")
    public String guardDBInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EFB6083A-7699-489B-8278-C0CB4793A96E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReceiveDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReceiveDBInstanceResponseBody self = new ReceiveDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReceiveDBInstanceResponseBody setGuardDBInstanceId(String guardDBInstanceId) {
        this.guardDBInstanceId = guardDBInstanceId;
        return this;
    }
    public String getGuardDBInstanceId() {
        return this.guardDBInstanceId;
    }

    public ReceiveDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
