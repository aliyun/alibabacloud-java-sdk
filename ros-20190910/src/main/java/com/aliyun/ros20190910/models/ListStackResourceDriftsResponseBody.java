// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourceDriftsResponseBody extends TeaModel {
    /**
     * <p>The query token returned in this call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource drifts.</p>
     */
    @NameInMap("ResourceDrifts")
    public java.util.List<ListStackResourceDriftsResponseBodyResourceDrifts> resourceDrifts;

    public static ListStackResourceDriftsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackResourceDriftsResponseBody self = new ListStackResourceDriftsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackResourceDriftsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListStackResourceDriftsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackResourceDriftsResponseBody setResourceDrifts(java.util.List<ListStackResourceDriftsResponseBodyResourceDrifts> resourceDrifts) {
        this.resourceDrifts = resourceDrifts;
        return this;
    }
    public java.util.List<ListStackResourceDriftsResponseBodyResourceDrifts> getResourceDrifts() {
        return this.resourceDrifts;
    }

    public static class ListStackResourceDriftsResponseBodyResourceDriftsModuleInfo extends TeaModel {
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

        public static ListStackResourceDriftsResponseBodyResourceDriftsModuleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListStackResourceDriftsResponseBodyResourceDriftsModuleInfo self = new ListStackResourceDriftsResponseBodyResourceDriftsModuleInfo();
            return TeaModel.build(map, self);
        }

        public ListStackResourceDriftsResponseBodyResourceDriftsModuleInfo setLogicalIdHierarchy(String logicalIdHierarchy) {
            this.logicalIdHierarchy = logicalIdHierarchy;
            return this;
        }
        public String getLogicalIdHierarchy() {
            return this.logicalIdHierarchy;
        }

        public ListStackResourceDriftsResponseBodyResourceDriftsModuleInfo setTypeHierarchy(String typeHierarchy) {
            this.typeHierarchy = typeHierarchy;
            return this;
        }
        public String getTypeHierarchy() {
            return this.typeHierarchy;
        }

    }

    public static class ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences extends TeaModel {
        /**
         * <p>The actual value of the resource property.</p>
         */
        @NameInMap("ActualValue")
        public String actualValue;

        /**
         * <p>The drift type of the resource property. Valid values:</p>
         * <br>
         * <p>*   ADD: The value is added to a resource property whose data type is Array or List.</p>
         * <p>*   REMOVE: The property is deleted from the current resource configuration.</p>
         * <p>*   NOT_EQUAL: The current property value differs from the expected value that is defined in the stack template.</p>
         */
        @NameInMap("DifferenceType")
        public String differenceType;

        /**
         * <p>The expected value of the resource property that is defined in the template.</p>
         */
        @NameInMap("ExpectedValue")
        public String expectedValue;

        /**
         * <p>The path of the resource property.</p>
         */
        @NameInMap("PropertyPath")
        public String propertyPath;

        public static ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences build(java.util.Map<String, ?> map) throws Exception {
            ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences self = new ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences();
            return TeaModel.build(map, self);
        }

        public ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences setDifferenceType(String differenceType) {
            this.differenceType = differenceType;
            return this;
        }
        public String getDifferenceType() {
            return this.differenceType;
        }

        public ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences setExpectedValue(String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }
        public String getExpectedValue() {
            return this.expectedValue;
        }

        public ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences setPropertyPath(String propertyPath) {
            this.propertyPath = propertyPath;
            return this;
        }
        public String getPropertyPath() {
            return this.propertyPath;
        }

    }

    public static class ListStackResourceDriftsResponseBodyResourceDrifts extends TeaModel {
        /**
         * <p>The actual JSON-formatted resource properties.</p>
         */
        @NameInMap("ActualProperties")
        public String actualProperties;

        /**
         * <p>The time when the drift detection operation was performed on the resource.</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        /**
         * <p>The JSON-formatted resource properties that are defined in the template.</p>
         */
        @NameInMap("ExpectedProperties")
        public String expectedProperties;

        /**
         * <p>The logical ID of the resource. The logical ID indicates the name of the resource that is defined in the template.</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The information about the modules from which the resource was created. This parameter is returned only if the resource is created from modules.</p>
         */
        @NameInMap("ModuleInfo")
        public ListStackResourceDriftsResponseBodyResourceDriftsModuleInfo moduleInfo;

        /**
         * <p>The physical ID of the resource.</p>
         */
        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        /**
         * <p>The property drifts of the resource.</p>
         */
        @NameInMap("PropertyDifferences")
        public java.util.List<ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences> propertyDifferences;

        /**
         * <p>The drift state of the resource. Valid values:</p>
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

        public static ListStackResourceDriftsResponseBodyResourceDrifts build(java.util.Map<String, ?> map) throws Exception {
            ListStackResourceDriftsResponseBodyResourceDrifts self = new ListStackResourceDriftsResponseBodyResourceDrifts();
            return TeaModel.build(map, self);
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setActualProperties(String actualProperties) {
            this.actualProperties = actualProperties;
            return this;
        }
        public String getActualProperties() {
            return this.actualProperties;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setExpectedProperties(String expectedProperties) {
            this.expectedProperties = expectedProperties;
            return this;
        }
        public String getExpectedProperties() {
            return this.expectedProperties;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setModuleInfo(ListStackResourceDriftsResponseBodyResourceDriftsModuleInfo moduleInfo) {
            this.moduleInfo = moduleInfo;
            return this;
        }
        public ListStackResourceDriftsResponseBodyResourceDriftsModuleInfo getModuleInfo() {
            return this.moduleInfo;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setPropertyDifferences(java.util.List<ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences> propertyDifferences) {
            this.propertyDifferences = propertyDifferences;
            return this;
        }
        public java.util.List<ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences> getPropertyDifferences() {
            return this.propertyDifferences;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setResourceDriftStatus(String resourceDriftStatus) {
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }
        public String getResourceDriftStatus() {
            return this.resourceDriftStatus;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

    }

}
