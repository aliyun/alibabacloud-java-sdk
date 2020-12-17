// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResourceResponse extends TeaModel {
    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("LogicalResourceId")
    @Validation(required = true)
    public String logicalResourceId;

    @NameInMap("Metadata")
    @Validation(required = true)
    public java.util.Map<String, ?> metadata;

    @NameInMap("PhysicalResourceId")
    @Validation(required = true)
    public String physicalResourceId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("StackName")
    @Validation(required = true)
    public String stackName;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("StatusReason")
    @Validation(required = true)
    public String statusReason;

    @NameInMap("UpdateTime")
    @Validation(required = true)
    public String updateTime;

    @NameInMap("ResourceDriftStatus")
    @Validation(required = true)
    public String resourceDriftStatus;

    @NameInMap("DriftDetectionTime")
    @Validation(required = true)
    public String driftDetectionTime;

    @NameInMap("ResourceAttributes")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> resourceAttributes;

    public static GetStackResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackResourceResponse self = new GetStackResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetStackResourceResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetStackResourceResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetStackResourceResponse setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    public GetStackResourceResponse setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public GetStackResourceResponse setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
        return this;
    }
    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    public GetStackResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackResourceResponse setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetStackResourceResponse setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetStackResourceResponse setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public GetStackResourceResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetStackResourceResponse setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public GetStackResourceResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetStackResourceResponse setResourceDriftStatus(String resourceDriftStatus) {
        this.resourceDriftStatus = resourceDriftStatus;
        return this;
    }
    public String getResourceDriftStatus() {
        return this.resourceDriftStatus;
    }

    public GetStackResourceResponse setDriftDetectionTime(String driftDetectionTime) {
        this.driftDetectionTime = driftDetectionTime;
        return this;
    }
    public String getDriftDetectionTime() {
        return this.driftDetectionTime;
    }

    public GetStackResourceResponse setResourceAttributes(java.util.List<java.util.Map<String, ?>> resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResourceAttributes() {
        return this.resourceAttributes;
    }

}
