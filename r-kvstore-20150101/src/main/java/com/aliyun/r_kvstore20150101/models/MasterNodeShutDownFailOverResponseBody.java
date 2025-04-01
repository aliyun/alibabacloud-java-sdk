// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class MasterNodeShutDownFailOverResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12123216-4B00-4378-BE4B-08005BFC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17566</p>
     */
    @NameInMap("TaskID")
    public String taskID;

    public static MasterNodeShutDownFailOverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MasterNodeShutDownFailOverResponseBody self = new MasterNodeShutDownFailOverResponseBody();
        return TeaModel.build(map, self);
    }

    public MasterNodeShutDownFailOverResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public MasterNodeShutDownFailOverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MasterNodeShutDownFailOverResponseBody setTaskID(String taskID) {
        this.taskID = taskID;
        return this;
    }
    public String getTaskID() {
        return this.taskID;
    }

}
