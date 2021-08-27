// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackResourceDriftResponseBody extends TeaModel {
    @NameInMap("LogicalResourceId")
    public String logicalResourceId;

    @NameInMap("PhysicalResourceId")
    public String physicalResourceId;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("DriftDetectionTime")
    public String driftDetectionTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExpectedProperties")
    public String expectedProperties;

    @NameInMap("ResourceDriftStatus")
    public String resourceDriftStatus;

    @NameInMap("ActualProperties")
    public String actualProperties;

    @NameInMap("PropertyDifferences")
    public java.util.List<DetectStackResourceDriftResponseBodyPropertyDifferences> propertyDifferences;

    public static DetectStackResourceDriftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectStackResourceDriftResponseBody self = new DetectStackResourceDriftResponseBody();
        return TeaModel.build(map, self);
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

    public DetectStackResourceDriftResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public DetectStackResourceDriftResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DetectStackResourceDriftResponseBody setDriftDetectionTime(String driftDetectionTime) {
        this.driftDetectionTime = driftDetectionTime;
        return this;
    }
    public String getDriftDetectionTime() {
        return this.driftDetectionTime;
    }

    public DetectStackResourceDriftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectStackResourceDriftResponseBody setExpectedProperties(String expectedProperties) {
        this.expectedProperties = expectedProperties;
        return this;
    }
    public String getExpectedProperties() {
        return this.expectedProperties;
    }

    public DetectStackResourceDriftResponseBody setResourceDriftStatus(String resourceDriftStatus) {
        this.resourceDriftStatus = resourceDriftStatus;
        return this;
    }
    public String getResourceDriftStatus() {
        return this.resourceDriftStatus;
    }

    public DetectStackResourceDriftResponseBody setActualProperties(String actualProperties) {
        this.actualProperties = actualProperties;
        return this;
    }
    public String getActualProperties() {
        return this.actualProperties;
    }

    public DetectStackResourceDriftResponseBody setPropertyDifferences(java.util.List<DetectStackResourceDriftResponseBodyPropertyDifferences> propertyDifferences) {
        this.propertyDifferences = propertyDifferences;
        return this;
    }
    public java.util.List<DetectStackResourceDriftResponseBodyPropertyDifferences> getPropertyDifferences() {
        return this.propertyDifferences;
    }

    public static class DetectStackResourceDriftResponseBodyPropertyDifferences extends TeaModel {
        @NameInMap("ActualValue")
        public String actualValue;

        @NameInMap("DifferenceType")
        public String differenceType;

        @NameInMap("PropertyPath")
        public String propertyPath;

        @NameInMap("ExpectedValue")
        public String expectedValue;

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

        public DetectStackResourceDriftResponseBodyPropertyDifferences setPropertyPath(String propertyPath) {
            this.propertyPath = propertyPath;
            return this;
        }
        public String getPropertyPath() {
            return this.propertyPath;
        }

        public DetectStackResourceDriftResponseBodyPropertyDifferences setExpectedValue(String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }
        public String getExpectedValue() {
            return this.expectedValue;
        }

    }

}
