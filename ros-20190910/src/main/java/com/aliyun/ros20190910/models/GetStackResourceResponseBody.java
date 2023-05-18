// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResourceResponseBody extends TeaModel {
    /**
     * <p>The resource type.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The reason why the resource is in its current state.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the stack.</p>
     */
    @NameInMap("DriftDetectionTime")
    public String driftDetectionTime;

    /**
     * <p>The time when the resource was updated.</p>
     * <br>
     * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
     */
    @NameInMap("LogicalResourceId")
    public String logicalResourceId;

    /**
     * <p>The list of the resource properties.</p>
     */
    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    @NameInMap("ModuleInfo")
    public GetStackResourceResponseBodyModuleInfo moduleInfo;

    /**
     * <p>The metadata.</p>
     */
    @NameInMap("PhysicalResourceId")
    public String physicalResourceId;

    /**
     * <p>The physical ID of the resource.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the resource in the last successful drift detection. Valid values:</p>
     * <br>
     * <p>*   DELETED: The actual configuration of the resource differs from its expected template configuration because the resource is deleted.</p>
     * <p>*   MODIFIED: The actual configuration of the resource differs from its expected template configuration.</p>
     * <p>*   NOT_CHECKED: ROS has not checked whether the actual configuration of the resource differs from its expected template configuration.</p>
     * <p>*   IN_SYNC: The actual configuration of the resource matches its expected template configuration.</p>
     */
    @NameInMap("ResourceAttributes")
    public java.util.List<java.util.Map<String, ?>> resourceAttributes;

    /**
     * <p>The time when the last successful drift detection was performed on the stack.</p>
     */
    @NameInMap("ResourceDriftStatus")
    public String resourceDriftStatus;

    /**
     * <p>The logical ID of the resource defined in the template.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("StackName")
    public String stackName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the resource was created.</p>
     * <br>
     * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
     */
    @NameInMap("StatusReason")
    public String statusReason;

    /**
     * <p>The name of the stack.</p>
     * <br>
     * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or letter.</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetStackResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackResourceResponseBody self = new GetStackResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackResourceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetStackResourceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetStackResourceResponseBody setDriftDetectionTime(String driftDetectionTime) {
        this.driftDetectionTime = driftDetectionTime;
        return this;
    }
    public String getDriftDetectionTime() {
        return this.driftDetectionTime;
    }

    public GetStackResourceResponseBody setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    public GetStackResourceResponseBody setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public GetStackResourceResponseBody setModuleInfo(GetStackResourceResponseBodyModuleInfo moduleInfo) {
        this.moduleInfo = moduleInfo;
        return this;
    }
    public GetStackResourceResponseBodyModuleInfo getModuleInfo() {
        return this.moduleInfo;
    }

    public GetStackResourceResponseBody setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
        return this;
    }
    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    public GetStackResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackResourceResponseBody setResourceAttributes(java.util.List<java.util.Map<String, ?>> resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResourceAttributes() {
        return this.resourceAttributes;
    }

    public GetStackResourceResponseBody setResourceDriftStatus(String resourceDriftStatus) {
        this.resourceDriftStatus = resourceDriftStatus;
        return this;
    }
    public String getResourceDriftStatus() {
        return this.resourceDriftStatus;
    }

    public GetStackResourceResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetStackResourceResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetStackResourceResponseBody setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public GetStackResourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetStackResourceResponseBody setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public GetStackResourceResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetStackResourceResponseBodyModuleInfo extends TeaModel {
        @NameInMap("LogicalIdHierarchy")
        public String logicalIdHierarchy;

        @NameInMap("TypeHierarchy")
        public String typeHierarchy;

        public static GetStackResourceResponseBodyModuleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStackResourceResponseBodyModuleInfo self = new GetStackResourceResponseBodyModuleInfo();
            return TeaModel.build(map, self);
        }

        public GetStackResourceResponseBodyModuleInfo setLogicalIdHierarchy(String logicalIdHierarchy) {
            this.logicalIdHierarchy = logicalIdHierarchy;
            return this;
        }
        public String getLogicalIdHierarchy() {
            return this.logicalIdHierarchy;
        }

        public GetStackResourceResponseBodyModuleInfo setTypeHierarchy(String typeHierarchy) {
            this.typeHierarchy = typeHierarchy;
            return this;
        }
        public String getTypeHierarchy() {
            return this.typeHierarchy;
        }

    }

}
