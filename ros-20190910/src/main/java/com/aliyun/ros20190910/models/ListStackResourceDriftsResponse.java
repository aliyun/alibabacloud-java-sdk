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

    }

}
