// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackInstance")
    @Validation(required = true)
    public GetStackInstanceResponseStackInstance stackInstance;

    public static GetStackInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackInstanceResponse self = new GetStackInstanceResponse();
        return TeaModel.build(map, self);
    }

    public static class GetStackInstanceResponseStackInstanceParameterOverrides extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        public static GetStackInstanceResponseStackInstanceParameterOverrides build(java.util.Map<String, ?> map) throws Exception {
            GetStackInstanceResponseStackInstanceParameterOverrides self = new GetStackInstanceResponseStackInstanceParameterOverrides();
            return TeaModel.build(map, self);
        }

    }

    public static class GetStackInstanceResponseStackInstance extends TeaModel {
        @NameInMap("StackGroupName")
        @Validation(required = true)
        public String stackGroupName;

        @NameInMap("StackGroupId")
        @Validation(required = true)
        public String stackGroupId;

        @NameInMap("StackId")
        @Validation(required = true)
        public String stackId;

        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StatusReason")
        @Validation(required = true)
        public String statusReason;

        @NameInMap("StackDriftStatus")
        @Validation(required = true)
        public String stackDriftStatus;

        @NameInMap("DriftDetectionTime")
        @Validation(required = true)
        public String driftDetectionTime;

        @NameInMap("ParameterOverrides")
        @Validation(required = true)
        public java.util.List<GetStackInstanceResponseStackInstanceParameterOverrides> parameterOverrides;

        public static GetStackInstanceResponseStackInstance build(java.util.Map<String, ?> map) throws Exception {
            GetStackInstanceResponseStackInstance self = new GetStackInstanceResponseStackInstance();
            return TeaModel.build(map, self);
        }

    }

}
