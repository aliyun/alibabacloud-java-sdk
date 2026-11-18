// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInspectionTaskReportRequest extends TeaModel {
    /**
     * <p>The inspection instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp19f4f6994813xxx</p>
     */
    @NameInMap("InspectionInsId")
    public String inspectionInsId;

    /**
     * <p>The assistant instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta-bp19f4f6994813xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The summary of risk levels for inspection results. You can specify multiple values. Valid values:</p>
     * <ul>
     * <li>Normal: normal</li>
     * <li>Warning: warning</li>
     * <li>Error: high-risk</li>
     * <li>Failed: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Error,Warning</p>
     */
    @NameInMap("LevelSummary")
    public String levelSummary;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tit-dca42f85c73644e0ab5c80ef64121axxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeInspectionTaskReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionTaskReportRequest self = new DescribeInspectionTaskReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionTaskReportRequest setInspectionInsId(String inspectionInsId) {
        this.inspectionInsId = inspectionInsId;
        return this;
    }
    public String getInspectionInsId() {
        return this.inspectionInsId;
    }

    public DescribeInspectionTaskReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInspectionTaskReportRequest setLevelSummary(String levelSummary) {
        this.levelSummary = levelSummary;
        return this;
    }
    public String getLevelSummary() {
        return this.levelSummary;
    }

    public DescribeInspectionTaskReportRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeInspectionTaskReportRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
