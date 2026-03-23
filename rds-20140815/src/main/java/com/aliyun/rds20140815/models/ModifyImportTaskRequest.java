// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyImportTaskRequest extends TeaModel {
    /**
     * <p>Instance ID. You can obtain it by invoking DescribeDBInstances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze63v2p3o3k****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Valid values:</p>
     * <ul>
     * <li>RETRY_IMPORT: retry import  </li>
     * <li>CANCEL: cancel job</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CANCEL</p>
     */
    @NameInMap("Operation")
    public String operation;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Destination region ID. You can view region IDs by invoking the DescribeRegions API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifyImportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImportTaskRequest self = new ModifyImportTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImportTaskRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyImportTaskRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ModifyImportTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyImportTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyImportTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
