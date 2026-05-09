// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateBatchTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;skillName&quot;:&quot;github&quot;,&quot;version&quot;:&quot;1.0.0&quot;},{&quot;skillName&quot;:&quot;skill-vetter&quot;,&quot;version&quot;:&quot;1.0.1&quot;}]</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>batch_task_test</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polarclaw_install_skills</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static CreateBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTaskRequest self = new CreateBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchTaskRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateBatchTaskRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public CreateBatchTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBatchTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateBatchTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
