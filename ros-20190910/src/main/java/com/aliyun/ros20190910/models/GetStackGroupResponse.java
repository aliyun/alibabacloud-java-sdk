// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackGroup")
    @Validation(required = true)
    public GetStackGroupResponseStackGroup stackGroup;

    public static GetStackGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupResponse self = new GetStackGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class GetStackGroupResponseStackGroupParameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        public static GetStackGroupResponseStackGroupParameters build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseStackGroupParameters self = new GetStackGroupResponseStackGroupParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail extends TeaModel {
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

        public static GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail self = new GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail();
            return TeaModel.build(map, self);
        }

    }

    public static class GetStackGroupResponseStackGroup extends TeaModel {
        @NameInMap("StackGroupName")
        @Validation(required = true)
        public String stackGroupName;

        @NameInMap("StackGroupId")
        @Validation(required = true)
        public String stackGroupId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("TemplateBody")
        @Validation(required = true)
        public String templateBody;

        @NameInMap("ExecutionRoleName")
        @Validation(required = true)
        public String executionRoleName;

        @NameInMap("AdministrationRoleName")
        @Validation(required = true)
        public String administrationRoleName;

        @NameInMap("Parameters")
        @Validation(required = true)
        public java.util.List<GetStackGroupResponseStackGroupParameters> parameters;

        @NameInMap("StackGroupDriftDetectionDetail")
        @Validation(required = true)
        public GetStackGroupResponseStackGroupStackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        public static GetStackGroupResponseStackGroup build(java.util.Map<String, ?> map) throws Exception {
            GetStackGroupResponseStackGroup self = new GetStackGroupResponseStackGroup();
            return TeaModel.build(map, self);
        }

    }

}
