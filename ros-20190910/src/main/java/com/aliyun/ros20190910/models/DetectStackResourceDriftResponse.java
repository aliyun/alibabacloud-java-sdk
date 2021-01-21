// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackResourceDriftResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DriftDetectionTime")
    @Validation(required = true)
    public String driftDetectionTime;

    @NameInMap("ResourceDriftStatus")
    @Validation(required = true)
    public String resourceDriftStatus;

    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("PhysicalResourceId")
    @Validation(required = true)
    public String physicalResourceId;

    @NameInMap("LogicalResourceId")
    @Validation(required = true)
    public String logicalResourceId;

    @NameInMap("ActualProperties")
    @Validation(required = true)
    public String actualProperties;

    @NameInMap("ExpectedProperties")
    @Validation(required = true)
    public String expectedProperties;

    @NameInMap("PropertyDifferences")
    @Validation(required = true)
    public java.util.List<DetectStackResourceDriftResponsePropertyDifferences> propertyDifferences;

    public static DetectStackResourceDriftResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectStackResourceDriftResponse self = new DetectStackResourceDriftResponse();
        return TeaModel.build(map, self);
    }

    public DetectStackResourceDriftResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectStackResourceDriftResponse setDriftDetectionTime(String driftDetectionTime) {
        this.driftDetectionTime = driftDetectionTime;
        return this;
    }
    public String getDriftDetectionTime() {
        return this.driftDetectionTime;
    }

    public DetectStackResourceDriftResponse setResourceDriftStatus(String resourceDriftStatus) {
        this.resourceDriftStatus = resourceDriftStatus;
        return this;
    }
    public String getResourceDriftStatus() {
        return this.resourceDriftStatus;
    }

    public DetectStackResourceDriftResponse setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public DetectStackResourceDriftResponse setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DetectStackResourceDriftResponse setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
        return this;
    }
    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    public DetectStackResourceDriftResponse setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    public DetectStackResourceDriftResponse setActualProperties(String actualProperties) {
        this.actualProperties = actualProperties;
        return this;
    }
    public String getActualProperties() {
        return this.actualProperties;
    }

    public DetectStackResourceDriftResponse setExpectedProperties(String expectedProperties) {
        this.expectedProperties = expectedProperties;
        return this;
    }
    public String getExpectedProperties() {
        return this.expectedProperties;
    }

    public DetectStackResourceDriftResponse setPropertyDifferences(java.util.List<DetectStackResourceDriftResponsePropertyDifferences> propertyDifferences) {
        this.propertyDifferences = propertyDifferences;
        return this;
    }
    public java.util.List<DetectStackResourceDriftResponsePropertyDifferences> getPropertyDifferences() {
        return this.propertyDifferences;
    }

    public static class DetectStackResourceDriftResponsePropertyDifferences extends TeaModel {
        @NameInMap("PropertyPath")
        @Validation(required = true)
        public String propertyPath;

        @NameInMap("ActualValue")
        @Validation(required = true)
        public String actualValue;

        @NameInMap("ExpectedValue")
        @Validation(required = true)
        public String expectedValue;

        @NameInMap("DifferenceType")
        @Validation(required = true)
        public String differenceType;

        public static DetectStackResourceDriftResponsePropertyDifferences build(java.util.Map<String, ?> map) throws Exception {
            DetectStackResourceDriftResponsePropertyDifferences self = new DetectStackResourceDriftResponsePropertyDifferences();
            return TeaModel.build(map, self);
        }

        public DetectStackResourceDriftResponsePropertyDifferences setPropertyPath(String propertyPath) {
            this.propertyPath = propertyPath;
            return this;
        }
        public String getPropertyPath() {
            return this.propertyPath;
        }

        public DetectStackResourceDriftResponsePropertyDifferences setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public DetectStackResourceDriftResponsePropertyDifferences setExpectedValue(String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }
        public String getExpectedValue() {
            return this.expectedValue;
        }

        public DetectStackResourceDriftResponsePropertyDifferences setDifferenceType(String differenceType) {
            this.differenceType = differenceType;
            return this;
        }
        public String getDifferenceType() {
            return this.differenceType;
        }

    }

}
