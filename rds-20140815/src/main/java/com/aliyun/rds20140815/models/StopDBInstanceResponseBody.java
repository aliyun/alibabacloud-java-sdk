// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A417FB41-A3D9-464E-AD0A-C7FE05C72E98</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDBInstanceResponseBody self = new StopDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
