// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateBatchTaskShrinkRequest extends TeaModel {
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The task parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;skillName&quot;:&quot;github&quot;,&quot;version&quot;:&quot;1.0.0&quot;},{&quot;skillName&quot;:&quot;skill-vetter&quot;,&quot;version&quot;:&quot;1.0.1&quot;}]</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the regions of all clusters in your account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the batch task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>batch_task_test</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The task type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polarclaw_install_skills</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static CreateBatchTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTaskShrinkRequest self = new CreateBatchTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchTaskShrinkRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public CreateBatchTaskShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public CreateBatchTaskShrinkRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public CreateBatchTaskShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBatchTaskShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateBatchTaskShrinkRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
