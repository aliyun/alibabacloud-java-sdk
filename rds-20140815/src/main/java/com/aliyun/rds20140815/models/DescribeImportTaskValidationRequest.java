// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeImportTaskValidationRequest extends TeaModel {
    /**
     * <p>Instance ID. You can obtain it by calling DescribeDBInstances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-xjkljj****</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Job ID. This is the job ID returned when you invoke the <strong>ValidateImportTask</strong> API to create a precheck for an import job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>41698****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static DescribeImportTaskValidationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportTaskValidationRequest self = new DescribeImportTaskValidationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImportTaskValidationRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public DescribeImportTaskValidationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImportTaskValidationRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
