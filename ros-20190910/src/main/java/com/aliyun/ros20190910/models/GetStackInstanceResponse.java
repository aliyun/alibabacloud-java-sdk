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

    public GetStackInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackInstanceResponse setStackInstance(GetStackInstanceResponseStackInstance stackInstance) {
        this.stackInstance = stackInstance;
        return this;
    }
    public GetStackInstanceResponseStackInstance getStackInstance() {
        return this.stackInstance;
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

        public GetStackInstanceResponseStackInstanceParameterOverrides setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetStackInstanceResponseStackInstanceParameterOverrides setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
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

        public GetStackInstanceResponseStackInstance setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public GetStackInstanceResponseStackInstance setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public GetStackInstanceResponseStackInstance setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public GetStackInstanceResponseStackInstance setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetStackInstanceResponseStackInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetStackInstanceResponseStackInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStackInstanceResponseStackInstance setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetStackInstanceResponseStackInstance setStackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }
        public String getStackDriftStatus() {
            return this.stackDriftStatus;
        }

        public GetStackInstanceResponseStackInstance setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public GetStackInstanceResponseStackInstance setParameterOverrides(java.util.List<GetStackInstanceResponseStackInstanceParameterOverrides> parameterOverrides) {
            this.parameterOverrides = parameterOverrides;
            return this;
        }
        public java.util.List<GetStackInstanceResponseStackInstanceParameterOverrides> getParameterOverrides() {
            return this.parameterOverrides;
        }

    }

}
