// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryPreCheckDatabaseRequest extends TeaModel {
    /**
     * <p>The UUID of the agent that is used to back up the data of the database.</p>
     * <br>
     * <p>> You can call the [DescribeUniBackupDatabase](~~DescribeUniBackupDatabase~~) operation to query the UUID.</p>
     */
    @NameInMap("InstanceUuid")
    public String instanceUuid;

    /**
     * <p>The ID of the database precheck task.</p>
     * <br>
     * <p>> You can call the [StartPreCheckDatabase](~~StartPreCheckDatabase~~) operation to query the ID of the database precheck task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The region ID of the server that hosts the database.</p>
     */
    @NameInMap("UniRegionId")
    public String uniRegionId;

    public static QueryPreCheckDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPreCheckDatabaseRequest self = new QueryPreCheckDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryPreCheckDatabaseRequest setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
        return this;
    }
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    public QueryPreCheckDatabaseRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryPreCheckDatabaseRequest setUniRegionId(String uniRegionId) {
        this.uniRegionId = uniRegionId;
        return this;
    }
    public String getUniRegionId() {
        return this.uniRegionId;
    }

}
