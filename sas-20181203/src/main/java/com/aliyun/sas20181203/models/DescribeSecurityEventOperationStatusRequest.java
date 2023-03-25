// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationStatusRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of the alert events.</p>
     * <br>
     * <p>>  You must specify at least one of the TaskId and SecurityEventIds parameters.</p>
     */
    @NameInMap("SecurityEventIds")
    public java.util.List<String> securityEventIds;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the task that handles the alert events.</p>
     * <br>
     * <p>>  You must specify at least one of the TaskId and SecurityEventIds parameters.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static DescribeSecurityEventOperationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationStatusRequest self = new DescribeSecurityEventOperationStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSecurityEventOperationStatusRequest setSecurityEventIds(java.util.List<String> securityEventIds) {
        this.securityEventIds = securityEventIds;
        return this;
    }
    public java.util.List<String> getSecurityEventIds() {
        return this.securityEventIds;
    }

    public DescribeSecurityEventOperationStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSecurityEventOperationStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
