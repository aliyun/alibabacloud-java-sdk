// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourcesResponseBody extends TeaModel {
    /**
     * <p>Details about resources.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the resource. Valid values:</p>
     * <br>
     * <p>*   INIT_COMPLETE: The resource is in the pending creation state.</p>
     * <p>*   CREATE_COMPLETE: The resource is created.</p>
     * <p>*   CREATE_FAILED: The resource fails to be created.</p>
     * <p>*   CREATE_IN_PROGRESS: The resource is being created.</p>
     * <p>*   UPDATE_IN_PROGRESS: The resource is being updated.</p>
     * <p>*   UPDATE_FAILED: The resource fails to be updated.</p>
     * <p>*   UPDATE_COMPLETE: The resource is updated.</p>
     * <p>*   DELETE_IN_PROGRESS: The resource is being deleted.</p>
     * <p>*   DELETE_FAILED: The resource fails to be deleted.</p>
     * <p>*   DELETE_COMPLETE: The resource is deleted.</p>
     * <p>*   CHECK_IN_PROGRESS: The resource is being validated.</p>
     * <p>*   CHECK_FAILED: The resource fails to be validated.</p>
     * <p>*   CHECK_COMPLETE: The resource is validated.</p>
     * <p>*   IMPORT_IN_PROGRESS: The resource is being imported.</p>
     * <p>*   IMPORT_FAILED: The resource fails to be imported.</p>
     * <p>*   IMPORT_COMPLETE: The resource is imported.</p>
     */
    @NameInMap("Resources")
    public java.util.List<ListStackResourcesResponseBodyResources> resources;

    public static ListStackResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackResourcesResponseBody self = new ListStackResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackResourcesResponseBody setResources(java.util.List<ListStackResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListStackResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class ListStackResourcesResponseBodyResourcesModuleInfo extends TeaModel {
        @NameInMap("LogicalIdHierarchy")
        public String logicalIdHierarchy;

        @NameInMap("TypeHierarchy")
        public String typeHierarchy;

        public static ListStackResourcesResponseBodyResourcesModuleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListStackResourcesResponseBodyResourcesModuleInfo self = new ListStackResourcesResponseBodyResourcesModuleInfo();
            return TeaModel.build(map, self);
        }

        public ListStackResourcesResponseBodyResourcesModuleInfo setLogicalIdHierarchy(String logicalIdHierarchy) {
            this.logicalIdHierarchy = logicalIdHierarchy;
            return this;
        }
        public String getLogicalIdHierarchy() {
            return this.logicalIdHierarchy;
        }

        public ListStackResourcesResponseBodyResourcesModuleInfo setTypeHierarchy(String typeHierarchy) {
            this.typeHierarchy = typeHierarchy;
            return this;
        }
        public String getTypeHierarchy() {
            return this.typeHierarchy;
        }

    }

    public static class ListStackResourcesResponseBodyResources extends TeaModel {
        /**
         * <p>The name of the stack.</p>
         * <br>
         * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or letter.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        /**
         * <p>The time when the resource was updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        @NameInMap("ModuleInfo")
        public ListStackResourcesResponseBodyResourcesModuleInfo moduleInfo;

        /**
         * <p>The most recent point in time when a successful drift detection operation was performed.</p>
         */
        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        /**
         * <p>The reason why the resource is in a specific state.</p>
         */
        @NameInMap("ResourceDriftStatus")
        public String resourceDriftStatus;

        /**
         * <p>The drift status of the resource in the most recent successful drift detection. Valid values:</p>
         * <br>
         * <p>*   DELETED: The actual configuration of the resource differs from its expected template configuration because the resource is deleted.</p>
         * <p>*   MODIFIED: The actual configuration of the resource differs from its expected template configuration.</p>
         * <p>*   NOT_CHECKED: ROS did not check whether the actual configuration of the resource differs from its expected template configuration.</p>
         * <p>*   IN_SYNC: The actual configuration of the resource matches its expected template configuration.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The physical ID of the resource.</p>
         */
        @NameInMap("StackId")
        public String stackId;

        @NameInMap("StackName")
        public String stackName;

        /**
         * <p>The logical ID of the resource. The logical ID is the resource name that is defined in the template.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the resource was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The ID of the stack.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListStackResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListStackResourcesResponseBodyResources self = new ListStackResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListStackResourcesResponseBodyResources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStackResourcesResponseBodyResources setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStackResourcesResponseBodyResources setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public ListStackResourcesResponseBodyResources setModuleInfo(ListStackResourcesResponseBodyResourcesModuleInfo moduleInfo) {
            this.moduleInfo = moduleInfo;
            return this;
        }
        public ListStackResourcesResponseBodyResourcesModuleInfo getModuleInfo() {
            return this.moduleInfo;
        }

        public ListStackResourcesResponseBodyResources setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public ListStackResourcesResponseBodyResources setResourceDriftStatus(String resourceDriftStatus) {
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }
        public String getResourceDriftStatus() {
            return this.resourceDriftStatus;
        }

        public ListStackResourcesResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListStackResourcesResponseBodyResources setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStackResourcesResponseBodyResources setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListStackResourcesResponseBodyResources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackResourcesResponseBodyResources setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListStackResourcesResponseBodyResources setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
