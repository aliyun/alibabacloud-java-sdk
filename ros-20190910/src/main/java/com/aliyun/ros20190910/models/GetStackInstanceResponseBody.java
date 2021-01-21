// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StackInstance")
    public GetStackInstanceResponseBodyStackInstance stackInstance;

    public static GetStackInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackInstanceResponseBody self = new GetStackInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackInstanceResponseBody setStackInstance(GetStackInstanceResponseBodyStackInstance stackInstance) {
        this.stackInstance = stackInstance;
        return this;
    }
    public GetStackInstanceResponseBodyStackInstance getStackInstance() {
        return this.stackInstance;
    }

    public static class GetStackInstanceResponseBodyStackInstanceParameterOverrides extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetStackInstanceResponseBodyStackInstanceParameterOverrides build(java.util.Map<String, ?> map) throws Exception {
            GetStackInstanceResponseBodyStackInstanceParameterOverrides self = new GetStackInstanceResponseBodyStackInstanceParameterOverrides();
            return TeaModel.build(map, self);
        }

        public GetStackInstanceResponseBodyStackInstanceParameterOverrides setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetStackInstanceResponseBodyStackInstanceParameterOverrides setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class GetStackInstanceResponseBodyStackInstance extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StackGroupId")
        public String stackGroupId;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        @NameInMap("StackDriftStatus")
        public String stackDriftStatus;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("ParameterOverrides")
        public java.util.List<GetStackInstanceResponseBodyStackInstanceParameterOverrides> parameterOverrides;

        @NameInMap("StackGroupName")
        public String stackGroupName;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("RegionId")
        public String regionId;

        public static GetStackInstanceResponseBodyStackInstance build(java.util.Map<String, ?> map) throws Exception {
            GetStackInstanceResponseBodyStackInstance self = new GetStackInstanceResponseBodyStackInstance();
            return TeaModel.build(map, self);
        }

        public GetStackInstanceResponseBodyStackInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStackInstanceResponseBodyStackInstance setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public GetStackInstanceResponseBodyStackInstance setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public GetStackInstanceResponseBodyStackInstance setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public GetStackInstanceResponseBodyStackInstance setStackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }
        public String getStackDriftStatus() {
            return this.stackDriftStatus;
        }

        public GetStackInstanceResponseBodyStackInstance setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetStackInstanceResponseBodyStackInstance setParameterOverrides(java.util.List<GetStackInstanceResponseBodyStackInstanceParameterOverrides> parameterOverrides) {
            this.parameterOverrides = parameterOverrides;
            return this;
        }
        public java.util.List<GetStackInstanceResponseBodyStackInstanceParameterOverrides> getParameterOverrides() {
            return this.parameterOverrides;
        }

        public GetStackInstanceResponseBodyStackInstance setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public GetStackInstanceResponseBodyStackInstance setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetStackInstanceResponseBodyStackInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
