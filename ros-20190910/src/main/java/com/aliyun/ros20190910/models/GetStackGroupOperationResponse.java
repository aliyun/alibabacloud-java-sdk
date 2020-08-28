// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupOperationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackGroupOperation")
    @Validation(required = true)
    public GetStackGroupOperationResponseStackGroupOperation stackGroupOperation;

    public static GetStackGroupOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupOperationResponse self = new GetStackGroupOperationResponse();
        return TeaModel.build(map, self);
    }

    public static class GetStackGroupOperationResponseStackGroupOperationOperationPreferences extends TeaModel {
        @NameInMap("FailureToleranceCount")
        @Validation(required = true)
        public Integer failureToleranceCount;

        @NameInMap("FailureTolerancePercentage")
        @Validation(required = true)
        public Integer failureTolerancePercentage;

        @NameInMap("MaxConcurrentCount")
        @Validation(required = true)
        public Integer maxConcurrentCount;

        @NameInMap("MaxConcurrentPercentage")
        @Validation(required = true)
        public Integer maxConcurrentPercentage;

        @NameInMap("RegionIdsOrder")
        @Validation(required = true)
        public java.util.List<String> regionIdsOrder;

        public static GetStackGroupOperationResponseStackGroupOperationOperationPreferences build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupOperationResponseStackGroupOperationOperationPreferences self = new GetStackGroupOperationResponseStackGroupOperationOperationPreferences();
            return TeaModel.build(map, self);
        }

    }

    public static class GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail extends TeaModel {
        @NameInMap("DriftDetectionTime")
        @Validation(required = true)
        public String driftDetectionTime;

        @NameInMap("StackGroupDriftStatus")
        @Validation(required = true)
        public String stackGroupDriftStatus;

        @NameInMap("DriftDetectionStatus")
        @Validation(required = true)
        public String driftDetectionStatus;

        @NameInMap("DriftedStackInstancesCount")
        @Validation(required = true)
        public Integer driftedStackInstancesCount;

        @NameInMap("FailedStackInstancesCount")
        @Validation(required = true)
        public Integer failedStackInstancesCount;

        @NameInMap("CancelledStackInstancesCount")
        @Validation(required = true)
        public Integer cancelledStackInstancesCount;

        @NameInMap("InProgressStackInstancesCount")
        @Validation(required = true)
        public Integer inProgressStackInstancesCount;

        @NameInMap("InSyncStackInstancesCount")
        @Validation(required = true)
        public Integer inSyncStackInstancesCount;

        @NameInMap("TotalStackInstancesCount")
        @Validation(required = true)
        public Integer totalStackInstancesCount;

        public static GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail self = new GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail();
            return TeaModel.build(map, self);
        }

    }

    public static class GetStackGroupOperationResponseStackGroupOperation extends TeaModel {
        @NameInMap("StackGroupName")
        @Validation(required = true)
        public String stackGroupName;

        @NameInMap("StackGroupId")
        @Validation(required = true)
        public String stackGroupId;

        @NameInMap("OperationId")
        @Validation(required = true)
        public String operationId;

        @NameInMap("OperationDescription")
        @Validation(required = true)
        public String operationDescription;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("Action")
        @Validation(required = true)
        public String action;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RetainStacks")
        @Validation(required = true)
        public Boolean retainStacks;

        @NameInMap("AdministratorRoleName")
        @Validation(required = true)
        public String administratorRoleName;

        @NameInMap("ExecutionRoleName")
        @Validation(required = true)
        public String executionRoleName;

        @NameInMap("OperationPreferences")
        @Validation(required = true)
        public GetStackGroupOperationResponseStackGroupOperationOperationPreferences operationPreferences;

        @NameInMap("StackGroupDriftDetectionDetail")
        @Validation(required = true)
        public GetStackGroupOperationResponseStackGroupOperationStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        public static GetStackGroupOperationResponseStackGroupOperation build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupOperationResponseStackGroupOperation self = new GetStackGroupOperationResponseStackGroupOperation();
            return TeaModel.build(map, self);
        }

    }

}
