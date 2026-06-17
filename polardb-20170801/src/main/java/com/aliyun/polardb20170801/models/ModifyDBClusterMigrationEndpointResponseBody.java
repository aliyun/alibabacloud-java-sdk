// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMigrationEndpointResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/173433.html">DescribeDBClusters</a> operation to view information about all clusters in the destination region, including the cluster ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-k2j1qqukj583di7n9</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F901FB05-8109-547F-A0B9-9C4FF7F4927A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>21498490</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifyDBClusterMigrationEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMigrationEndpointResponseBody self = new ModifyDBClusterMigrationEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterMigrationEndpointResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterMigrationEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDBClusterMigrationEndpointResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
