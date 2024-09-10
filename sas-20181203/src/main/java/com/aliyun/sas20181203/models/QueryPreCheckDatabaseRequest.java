// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryPreCheckDatabaseRequest extends TeaModel {
    /**
     * <p>The UUID of the agent that is used to back up the data of the database.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeUniBackupDatabase~~">DescribeUniBackupDatabase</a> operation to query the UUID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ebc895506c6911ed800000163e0e****</p>
     */
    @NameInMap("InstanceUuid")
    public String instanceUuid;

    /**
     * <p>The ID of the database precheck task.</p>
     * <blockquote>
     * <p>You can call the <a href="~~StartPreCheckDatabase~~">StartPreCheckDatabase</a> operation to query the ID of the database precheck task.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>t-000bc9nqwxsbyvod****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The region ID of the server that hosts the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
