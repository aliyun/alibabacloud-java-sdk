// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInspectionTaskReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>r-bp19f4f6994813xxx</p>
     */
    @NameInMap("InspectionInsId")
    public String inspectionInsId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta-bp19f4f6994813xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
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
