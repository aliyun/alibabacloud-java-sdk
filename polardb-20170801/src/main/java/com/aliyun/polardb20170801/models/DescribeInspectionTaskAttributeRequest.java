// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeInspectionTaskAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the region where the task resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the inspection task to query. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-001</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeInspectionTaskAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionTaskAttributeRequest self = new DescribeInspectionTaskAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionTaskAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInspectionTaskAttributeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
