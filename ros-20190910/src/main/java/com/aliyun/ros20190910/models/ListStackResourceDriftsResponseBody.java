// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourceDriftsResponseBody extends TeaModel {
    @NameInMap("ResourceDrifts")
    public java.util.List<ListStackResourceDriftsResponseBodyResourceDrifts> resourceDrifts;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListStackResourceDriftsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackResourceDriftsResponseBody self = new ListStackResourceDriftsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackResourceDriftsResponseBody setResourceDrifts(java.util.List<ListStackResourceDriftsResponseBodyResourceDrifts> resourceDrifts) {
        this.resourceDrifts = resourceDrifts;
        return this;
    }
    public java.util.List<ListStackResourceDriftsResponseBodyResourceDrifts> getResourceDrifts() {
        return this.resourceDrifts;
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

    public static class ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences extends TeaModel {
        @NameInMap("ActualValue")
        public String actualValue;

        @NameInMap("DifferenceType")
        public String differenceType;

        @NameInMap("PropertyPath")
        public String propertyPath;

        @NameInMap("ExpectedValue")
        public String expectedValue;

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

        public ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences setPropertyPath(String propertyPath) {
            this.propertyPath = propertyPath;
            return this;
        }
        public String getPropertyPath() {
            return this.propertyPath;
        }

        public ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences setExpectedValue(String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }
        public String getExpectedValue() {
            return this.expectedValue;
        }

    }

    public static class ListStackResourceDriftsResponseBodyResourceDrifts extends TeaModel {
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ExpectedProperties")
        public String expectedProperties;

        @NameInMap("ResourceDriftStatus")
        public String resourceDriftStatus;

        @NameInMap("PropertyDifferences")
        public java.util.List<ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences> propertyDifferences;

        @NameInMap("ActualProperties")
        public String actualProperties;

        public static ListStackResourceDriftsResponseBodyResourceDrifts build(java.util.Map<String, ?> map) throws Exception {
            ListStackResourceDriftsResponseBodyResourceDrifts self = new ListStackResourceDriftsResponseBodyResourceDrifts();
            return TeaModel.build(map, self);
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setExpectedProperties(String expectedProperties) {
            this.expectedProperties = expectedProperties;
            return this;
        }
        public String getExpectedProperties() {
            return this.expectedProperties;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setResourceDriftStatus(String resourceDriftStatus) {
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }
        public String getResourceDriftStatus() {
            return this.resourceDriftStatus;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setPropertyDifferences(java.util.List<ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences> propertyDifferences) {
            this.propertyDifferences = propertyDifferences;
            return this;
        }
        public java.util.List<ListStackResourceDriftsResponseBodyResourceDriftsPropertyDifferences> getPropertyDifferences() {
            return this.propertyDifferences;
        }

        public ListStackResourceDriftsResponseBodyResourceDrifts setActualProperties(String actualProperties) {
            this.actualProperties = actualProperties;
            return this;
        }
        public String getActualProperties() {
            return this.actualProperties;
        }

    }

}
