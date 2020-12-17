// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourceDriftsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("ResourceDrifts")
    @Validation(required = true)
    public java.util.List<ListStackResourceDriftsResponseResourceDrifts> resourceDrifts;

    public static ListStackResourceDriftsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackResourceDriftsResponse self = new ListStackResourceDriftsResponse();
        return TeaModel.build(map, self);
    }

    public ListStackResourceDriftsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackResourceDriftsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListStackResourceDriftsResponse setResourceDrifts(java.util.List<ListStackResourceDriftsResponseResourceDrifts> resourceDrifts) {
        this.resourceDrifts = resourceDrifts;
        return this;
    }
    public java.util.List<ListStackResourceDriftsResponseResourceDrifts> getResourceDrifts() {
        return this.resourceDrifts;
    }

    public static class ListStackResourceDriftsResponseResourceDriftsPropertyDifferences extends TeaModel {
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

        public static ListStackResourceDriftsResponseResourceDriftsPropertyDifferences build(java.util.Map<String, ?> map) throws Exception {
            ListStackResourceDriftsResponseResourceDriftsPropertyDifferences self = new ListStackResourceDriftsResponseResourceDriftsPropertyDifferences();
            return TeaModel.build(map, self);
        }

        public ListStackResourceDriftsResponseResourceDriftsPropertyDifferences setPropertyPath(String propertyPath) {
            this.propertyPath = propertyPath;
            return this;
        }
        public String getPropertyPath() {
            return this.propertyPath;
        }

        public ListStackResourceDriftsResponseResourceDriftsPropertyDifferences setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public ListStackResourceDriftsResponseResourceDriftsPropertyDifferences setExpectedValue(String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }
        public String getExpectedValue() {
            return this.expectedValue;
        }

        public ListStackResourceDriftsResponseResourceDriftsPropertyDifferences setDifferenceType(String differenceType) {
            this.differenceType = differenceType;
            return this;
        }
        public String getDifferenceType() {
            return this.differenceType;
        }

    }

    public static class ListStackResourceDriftsResponseResourceDrifts extends TeaModel {
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
        public java.util.List<ListStackResourceDriftsResponseResourceDriftsPropertyDifferences> propertyDifferences;

        public static ListStackResourceDriftsResponseResourceDrifts build(java.util.Map<String, ?> map) throws Exception {
            ListStackResourceDriftsResponseResourceDrifts self = new ListStackResourceDriftsResponseResourceDrifts();
            return TeaModel.build(map, self);
        }

        public ListStackResourceDriftsResponseResourceDrifts setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStackResourceDriftsResponseResourceDrifts setResourceDriftStatus(String resourceDriftStatus) {
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }
        public String getResourceDriftStatus() {
            return this.resourceDriftStatus;
        }

        public ListStackResourceDriftsResponseResourceDrifts setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStackResourceDriftsResponseResourceDrifts setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListStackResourceDriftsResponseResourceDrifts setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public ListStackResourceDriftsResponseResourceDrifts setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public ListStackResourceDriftsResponseResourceDrifts setActualProperties(String actualProperties) {
            this.actualProperties = actualProperties;
            return this;
        }
        public String getActualProperties() {
            return this.actualProperties;
        }

        public ListStackResourceDriftsResponseResourceDrifts setExpectedProperties(String expectedProperties) {
            this.expectedProperties = expectedProperties;
            return this;
        }
        public String getExpectedProperties() {
            return this.expectedProperties;
        }

        public ListStackResourceDriftsResponseResourceDrifts setPropertyDifferences(java.util.List<ListStackResourceDriftsResponseResourceDriftsPropertyDifferences> propertyDifferences) {
            this.propertyDifferences = propertyDifferences;
            return this;
        }
        public java.util.List<ListStackResourceDriftsResponseResourceDriftsPropertyDifferences> getPropertyDifferences() {
            return this.propertyDifferences;
        }

    }

}
