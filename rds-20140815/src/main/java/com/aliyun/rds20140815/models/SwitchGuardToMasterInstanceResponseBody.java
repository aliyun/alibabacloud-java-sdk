// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchGuardToMasterInstanceResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EFB6083A-7699-489B-8278-C0CB4793A96E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchGuardToMasterInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchGuardToMasterInstanceResponseBody self = new SwitchGuardToMasterInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchGuardToMasterInstanceResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public SwitchGuardToMasterInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
