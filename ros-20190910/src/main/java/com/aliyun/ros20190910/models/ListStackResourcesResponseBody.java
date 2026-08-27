// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourcesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of resource objects.</p>
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
         * <p>The concatenated list of logical IDs of one or more modules that contain the resource. The modules are listed starting from the outermost module and are separated by <code>/</code>.</p>
         * <p>In the following example, the resource is created from a module moduleB that is nested in a parent module moduleA.</p>
         * <p><code>moduleA/moduleB</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>moduleA/moduleB</p>
         */
        @NameInMap("LogicalIdHierarchy")
        public String logicalIdHierarchy;

        /**
         * <p>The concatenated list of module types of one or more modules that contain the resource. The module types are listed starting from the outermost module and are separated by <code>/</code>.</p>
         * <p>In the following example, the resource is created from a module of the <code>MODULE::ROS::Child::Example</code> type, which is nested in a parent module of the <code>MODULE::ROS::Parent::Example</code> type.</p>
         * <p><code>MODULE::ROS::Parent::Example/MODULE::ROS::Child::Example</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>MODULE::ROS::Parent::Example/MODULE::ROS::Child::Example</p>
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
         * <p>The time when the resource was created. The time is displayed in UTC+0 and follows the ISO 8601 standard. The time is in the YYYY-MM-DDThh:mm:ss format without the Z suffix.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-01T06:01:23</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the resource drift was detected during the most recent successful drift detection on the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-27T07:47:47</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        /**
         * <p>The logical resource ID, which is the name defined in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>dummy</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The information about the module from which the resource is created. This parameter is returned only if the resource is created from a module.</p>
         */
        @NameInMap("ModuleInfo")
        public ListStackResourcesResponseBodyResourcesModuleInfo moduleInfo;

        /**
         * <p>The physical resource ID, which is the actual resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d04af923-e6b7-4272-aeaa-47ec9777****</p>
         */
        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        /**
         * <p>The drift status of the resource in the most recent successful drift detection on the stack. Valid values:</p>
         * <ul>
         * <li>DELETED: The resource differs from the expected template configuration because the resource is deleted.</li>
         * <li>MODIFIED: The resource differs from the expected template configuration.</li>
         * <li>NOT_CHECKED: Resource Orchestration Service (ROS) has not checked whether the resource differs from the expected template configuration.</li>
         * <li>IN_SYNC: The current configuration of the resource matches the expected template configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IN_SYNC</p>
         */
        @NameInMap("ResourceDriftStatus")
        public String resourceDriftStatus;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ROS::Stack</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The stack ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The stack name. The name can be up to 255 characters in length and must start with a digit or a letter. It can contain digits, letters, hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>test-describe-resource</p>
         */
        @NameInMap("StackName")
        public String stackName;

        /**
         * <p>The resource status. Valid values:</p>
         * <ul>
         * <li><p>INIT_COMPLETE: The resource is pending creation.</p>
         * </li>
         * <li><p>CREATE_COMPLETE: The resource is created.</p>
         * </li>
         * <li><p>CREATE_FAILED: The resource failed to be created.</p>
         * </li>
         * <li><p>CREATE_IN_PROGRESS: The resource is being created.</p>
         * </li>
         * <li><p>UPDATE_IN_PROGRESS: The resource is being updated.</p>
         * </li>
         * <li><p>UPDATE_FAILED: The resource failed to be updated.</p>
         * </li>
         * <li><p>UPDATE_COMPLETE: The resource is updated.</p>
         * </li>
         * <li><p>DELETE_IN_PROGRESS: The resource is being deleted.</p>
         * </li>
         * <li><p>DELETE_FAILED: The resource failed to be deleted.</p>
         * </li>
         * <li><p>DELETE_COMPLETE: The resource is deleted.</p>
         * </li>
         * <li><p>CHECK_IN_PROGRESS: The resource is being checked.</p>
         * </li>
         * <li><p>CHECK_FAILED: The resource failed to be checked.</p>
         * </li>
         * <li><p>CHECK_COMPLETE: The resource is checked.</p>
         * </li>
         * <li><p>IMPORT_IN_PROGRESS: The resource import is in progress.</p>
         * </li>
         * <li><p>IMPORT_FAILED: The resource import failed.</p>
         * </li>
         * <li><p>IMPORT_COMPLETE: The resource import is complete.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UPDATE_COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason for the resource status.</p>
         * 
         * <strong>example:</strong>
         * <p>state changed</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The time when the resource was last updated. The time is displayed in UTC+0 and follows the ISO 8601 standard. The time is in the YYYY-MM-DDThh:mm:ss format without the Z suffix.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-01T06:01:29</p>
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
