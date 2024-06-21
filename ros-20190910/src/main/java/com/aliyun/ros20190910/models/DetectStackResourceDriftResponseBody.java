// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackResourceDriftResponseBody extends TeaModel {
    /**
     * <p>The actual JSON-formatted resource properties.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ScalingRuleName&quot;: &quot;test1&quot;}</p>
     */
    @NameInMap("ActualProperties")
    public String actualProperties;

    /**
     * <p>The time when the resource drift detection was initiated.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-27T07:47:47</p>
     */
    @NameInMap("DriftDetectionTime")
    public String driftDetectionTime;

    /**
     * <p>The JSON-formatted resource properties that are defined in the template.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ScalingRuleName&quot;: &quot;test2&quot;}</p>
     */
    @NameInMap("ExpectedProperties")
    public String expectedProperties;

    /**
     * <p>The logical ID of the resource that is defined in the template.</p>
     * 
     * <strong>example:</strong>
     * <p>ScalingRule</p>
     */
    @NameInMap("LogicalResourceId")
    public String logicalResourceId;

    /**
     * <p>The physical ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>asr-2ze4zzc3kf9yz1kd****</p>
     */
    @NameInMap("PhysicalResourceId")
    public String physicalResourceId;

    /**
     * <p>The property drifts of the resource.</p>
     */
    @NameInMap("PropertyDifferences")
    public java.util.List<DetectStackResourceDriftResponseBodyPropertyDifferences> propertyDifferences;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The drift status of the resource. Valid values:</p>
     * <ul>
     * <li>DELETED: The actual configuration of the resource differs from its expected template configuration because the resource is deleted.</li>
     * <li>MODIFIED: The actual configuration of the resource differs from its expected template configuration.</li>
     * <li>NOT_CHECKED: Resource Orchestration Service (ROS) has not checked whether the actual configuration of the resource differs from its expected template configuration.</li>
     * <li>IN_SYNC: The actual configuration of the resource matches its expected template configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MODIFIED</p>
     */
    @NameInMap("ResourceDriftStatus")
    public String resourceDriftStatus;

    /**
     * <p>The type of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN::ESS::ScalingRule</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the stack.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
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
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("ActualValue")
        public String actualValue;

        /**
         * <p>The drift type of the resource property. Valid values:</p>
         * <ul>
         * <li>ADD: The property value has been added to a resource property whose data type was Array or List.</li>
         * <li>REMOVE: The property has been deleted from the current resource configuration.</li>
         * <li>NOT_EQUAL: The current property value differs from the expected value defined in the stack template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOT_EQUAL</p>
         */
        @NameInMap("DifferenceType")
        public String differenceType;

        /**
         * <p>The expected value of the resource property that is defined in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        @NameInMap("ExpectedValue")
        public String expectedValue;

        /**
         * <p>The path of the resource property.</p>
         * 
         * <strong>example:</strong>
         * <p>/ScalingRuleName</p>
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
