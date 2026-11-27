// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyFEClusterResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0BF61F90-ACED-55DF-A6FE-56714B2BFCF6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFEClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFEClusterResponseBody self = new ModifyFEClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFEClusterResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyFEClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
