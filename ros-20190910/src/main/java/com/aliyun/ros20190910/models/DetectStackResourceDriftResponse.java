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

    }

}
