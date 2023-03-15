// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackResourceDriftResponseBody extends TeaModel {
    /**
     * <p>The actual resource properties in JSON format.</p>
     */
    @NameInMap("ActualProperties")
    public String actualProperties;

    /**
     * <p>The time at which the resource drift detection operation was initiated.</p>
     */
    @NameInMap("DriftDetectionTime")
    public String driftDetectionTime;

    /**
     * <p>The resource properties as defined in the template, in JSON format.</p>
     */
    @NameInMap("ExpectedProperties")
    public String expectedProperties;

    /**
     * <p>The logical ID of the resource as defined in the template.</p>
     */
    @NameInMap("LogicalResourceId")
    public String logicalResourceId;

    /**
     * <p>The physical ID of the resource.</p>
     */
    @NameInMap("PhysicalResourceId")
    public String physicalResourceId;

    /**
     * <p>The property differences of the resource.</p>
     */
    @NameInMap("PropertyDifferences")
    public java.util.List<DetectStackResourceDriftResponseBodyPropertyDifferences> propertyDifferences;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource drift status. Valid values:</p>
     * <br>
     * <p>*   DELETED: The actual configuration of the resource differs from its expected template configuration because the resource has been deleted.</p>
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
     * <p>The ID of the stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static DetectStackResourceDriftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectStackResourceDriftResponseBody self = new DetectStackResourceDriftResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectStackResourceDriftResponseBody setActualProperties(String actualProperties) {
        this.actualProperties = actualProperties;
        return this;
    }
    public String getActualProperties() {
        return this.actualProperties;
    }

    public DetectStackResourceDriftResponseBody setDriftDetectionTime(String driftDetectionTime) {
        this.driftDetectionTime = driftDetectionTime;
        return this;
    }
    public String getDriftDetectionTime() {
        return this.driftDetectionTime;
    }

    public DetectStackResourceDriftResponseBody setExpectedProperties(String expectedProperties) {
        this.expectedProperties = expectedProperties;
        return this;
    }
    public String getExpectedProperties() {
        return this.expectedProperties;
    }

    public DetectStackResourceDriftResponseBody setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    public DetectStackResourceDriftResponseBody setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
        return this;
    }
    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    public DetectStackResourceDriftResponseBody setPropertyDifferences(java.util.List<DetectStackResourceDriftResponseBodyPropertyDifferences> propertyDifferences) {
        this.propertyDifferences = propertyDifferences;
        return this;
    }
    public java.util.List<DetectStackResourceDriftResponseBodyPropertyDifferences> getPropertyDifferences() {
        return this.propertyDifferences;
    }

    public DetectStackResourceDriftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectStackResourceDriftResponseBody setResourceDriftStatus(String resourceDriftStatus) {
        this.resourceDriftStatus = resourceDriftStatus;
        return this;
    }
    public String getResourceDriftStatus() {
        return this.resourceDriftStatus;
    }

    public DetectStackResourceDriftResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DetectStackResourceDriftResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public static class DetectStackResourceDriftResponseBodyPropertyDifferences extends TeaModel {
        /**
         * <p>The actual value of the resource property.</p>
         */
        @NameInMap("ActualValue")
        public String actualValue;

        /**
         * <p>The drift type of the resource property. Valid values:</p>
         * <br>
         * <p>*   ADD: The value has been added to a resource property whose data type is Array or List.</p>
         * <p>*   REMOVE: The property has been deleted from the current resource configuration.</p>
         * <p>*   NOT_EQUAL: The current property value differs from the expected value defined in the stack template.</p>
         */
        @NameInMap("DifferenceType")
        public String differenceType;

        /**
         * <p>The expected value of the resource property as defined in the template.</p>
         */
        @NameInMap("ExpectedValue")
        public String expectedValue;

        /**
         * <p>The path of the resource property.</p>
         */
        @NameInMap("PropertyPath")
        public String propertyPath;

        public static DetectStackResourceDriftResponseBodyPropertyDifferences build(java.util.Map<String, ?> map) throws Exception {
            DetectStackResourceDriftResponseBodyPropertyDifferences self = new DetectStackResourceDriftResponseBodyPropertyDifferences();
            return TeaModel.build(map, self);
        }

        public DetectStackResourceDriftResponseBodyPropertyDifferences setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public DetectStackResourceDriftResponseBodyPropertyDifferences setDifferenceType(String differenceType) {
            this.differenceType = differenceType;
            return this;
        }
        public String getDifferenceType() {
            return this.differenceType;
        }

        public DetectStackResourceDriftResponseBodyPropertyDifferences setExpectedValue(String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }
        public String getExpectedValue() {
            return this.expectedValue;
        }

        public DetectStackResourceDriftResponseBodyPropertyDifferences setPropertyPath(String propertyPath) {
            this.propertyPath = propertyPath;
            return this;
        }
        public String getPropertyPath() {
            return this.propertyPath;
        }

    }

}
