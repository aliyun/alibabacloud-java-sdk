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
     * <p>The resources.</p>
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
        /**
         * <p>The concatenated logical IDs of one or more modules that contain the resource. The modules are listed from the outermost layer and separated by forward slashes (`/`).</p>
         * <br>
         * <p>In the following example, the resource is created from Module B nested within Parent Module A:</p>
         * <br>
         * <p>`moduleA/moduleB`</p>
         */
        @NameInMap("LogicalIdHierarchy")
        public String logicalIdHierarchy;

        /**
         * <p>The concatenated types of one or more modules that contain the resource. The module types are listed from the outermost layer and separated by forward slashes (`/`).</p>
         * <br>
         * <p>In the following example, the resource is created from a module of the `MODULE::ROS::Child::Example` type that is nested within a parent module of the `MODULE::ROS::Parent::Example` type:</p>
         * <br>
         * <p>`MODULE::ROS::Parent::Example/MODULE::ROS::Child::Example`</p>
         */
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
         * <p>The time when the resource was created. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the most recent successful drift detection was performed on the stack.</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        /**
         * <p>The logical ID of the resource. The logical ID is the resource name that is defined in the template.</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The information about the modules from which the resource is created. This parameter is returned only if the resource is created from modules.</p>
         */
        @NameInMap("ModuleInfo")
        public ListStackResourcesResponseBodyResourcesModuleInfo moduleInfo;

        /**
         * <p>The physical ID of the resource.</p>
         */
        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        /**
         * <p>The drift state of the resource in the most recent successful drift detection. Valid values:</p>
         * <br>
         * <p>*   DELETED: The actual configuration of the resource differs from its expected template configuration because the resource is deleted.</p>
         * <p>*   MODIFIED: The actual configuration of the resource differs from its expected template configuration.</p>
         * <p>*   NOT_CHECKED: Resource Orchestration Service (ROS) has not checked whether the actual configuration of the resource differs from its expected template configuration.</p>
         * <p>*   IN_SYNC: The actual configuration of the resource matches its expected template configuration.</p>
         */
        @NameInMap("ResourceDriftStatus")
        public String resourceDriftStatus;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The stack ID.</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The stack name.\</p>
         * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). It must start with a digit or letter.</p>
         */
        @NameInMap("StackName")
        public String stackName;

        /**
         * <p>The state of the resource. Valid values:</p>
         * <br>
         * <p>*   INIT_COMPLETE: The resource is pending to be created.</p>
         * <p>*   CREATE_COMPLETE: The resource is created.</p>
         * <p>*   CREATE_FAILED: The resource failed to be created.</p>
         * <p>*   CREATE_IN_PROGRESS: The resource is being created.</p>
         * <p>*   UPDATE_IN_PROGRESS: The resource is being updated.</p>
         * <p>*   UPDATE_FAILED: The resource failed to be updated.</p>
         * <p>*   UPDATE_COMPLETE: The resource is updated.</p>
         * <p>*   DELETE_IN_PROGRESS: The resource is being deleted.</p>
         * <p>*   DELETE_FAILED: The resource failed to be deleted.</p>
         * <p>*   DELETE_COMPLETE: The resource is deleted.</p>
         * <p>*   CHECK_IN_PROGRESS: The resource is being validated.</p>
         * <p>*   CHECK_FAILED: The resource failed to be validated.</p>
         * <p>*   CHECK_COMPLETE: The resource is validated.</p>
         * <p>*   IMPORT_IN_PROGRESS: The resource is being imported.</p>
         * <p>*   IMPORT_FAILED: The resource failed to be imported.</p>
         * <p>*   IMPORT_COMPLETE: The resource is imported.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the resource is in its current state.</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The time when the resource was updated. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
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
