// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the stack.</p>
     */
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
        /**
         * <p>The name of the parameter that is used to override a specific parameter.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter that is used to override a specific parameter.</p>
         */
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
        /**
         * <p>The ID of the destination account to which the stack belongs.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The time when the most recent successful drift detection was performed on the stack group.</p>
         * <br>
         * <p>> This parameter is returned only if drift detection is performed on the stack group.</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        /**
         * <p>The outputs of the stack.</p>
         * <br>
         * <p>>  This parameter is returned if OutputOption is set to Enabled.</p>
         */
        @NameInMap("Outputs")
        public java.util.List<java.util.Map<String, ?>> outputs;

        /**
         * <p>The parameters that are used to override specific parameters.</p>
         */
        @NameInMap("ParameterOverrides")
        public java.util.List<GetStackInstanceResponseBodyStackInstanceParameterOverrides> parameterOverrides;

        /**
         * <p>The ID of the folder in the resource directory.</p>
         * <br>
         * <p>> This parameter is returned only if the stack group is granted service-managed permissions.</p>
         */
        @NameInMap("RdFolderId")
        public String rdFolderId;

        /**
         * <p>The region ID of the stack.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The state of the stack when the most recent successful drift detection was performed on the stack group.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   DRIFTED: The stack has drifted.</p>
         * <p>*   NOT_CHECKED: No successful drift detection is performed on the stack.</p>
         * <p>*   IN_SYNC: The stack is being synchronized.</p>
         * <br>
         * <p>> This parameter is returned only if drift detection is performed on the stack group.</p>
         */
        @NameInMap("StackDriftStatus")
        public String stackDriftStatus;

        /**
         * <p>The ID of the stack group.</p>
         */
        @NameInMap("StackGroupId")
        public String stackGroupId;

        /**
         * <p>The name of the stack group.</p>
         */
        @NameInMap("StackGroupName")
        public String stackGroupName;

        /**
         * <p>The stack ID.</p>
         * <br>
         * <p>> This parameter is returned only if the stack is in the CURRENT state.</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The state of the stack.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   CURRENT: The stack is up-to-date with the stack group.</p>
         * <br>
         * <p>*   OUTDATED: The stack is not up-to-date with the stack group. Stacks are in the OUTDATED state due to the following possible reasons:</p>
         * <br>
         * <p>    *   When the CreateStackInstances operation is called to create stacks, the stacks fail to be created.</p>
         * <p>    *   When the UpdateStackInstances or UpdateStackGroup operation is called to update stacks, the stacks fail to be updated, or only specific stacks are updated.</p>
         * <p>    *   The creation or update operation is not complete.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the stack instance is in the OUTDATED state.</p>
         * <br>
         * <p>> This parameter is returned only if the stack instance is in the OUTDATED state.</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        public static GetStackInstanceResponseBodyStackInstance build(java.util.Map<String, ?> map) throws Exception {
            GetStackInstanceResponseBodyStackInstance self = new GetStackInstanceResponseBodyStackInstance();
            return TeaModel.build(map, self);
        }

        public GetStackInstanceResponseBodyStackInstance setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetStackInstanceResponseBodyStackInstance setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public GetStackInstanceResponseBodyStackInstance setOutputs(java.util.List<java.util.Map<String, ?>> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getOutputs() {
            return this.outputs;
        }

        public GetStackInstanceResponseBodyStackInstance setParameterOverrides(java.util.List<GetStackInstanceResponseBodyStackInstanceParameterOverrides> parameterOverrides) {
            this.parameterOverrides = parameterOverrides;
            return this;
        }
        public java.util.List<GetStackInstanceResponseBodyStackInstanceParameterOverrides> getParameterOverrides() {
            return this.parameterOverrides;
        }

        public GetStackInstanceResponseBodyStackInstance setRdFolderId(String rdFolderId) {
            this.rdFolderId = rdFolderId;
            return this;
        }
        public String getRdFolderId() {
            return this.rdFolderId;
        }

        public GetStackInstanceResponseBodyStackInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetStackInstanceResponseBodyStackInstance setStackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }
        public String getStackDriftStatus() {
            return this.stackDriftStatus;
        }

        public GetStackInstanceResponseBodyStackInstance setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public GetStackInstanceResponseBodyStackInstance setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public GetStackInstanceResponseBodyStackInstance setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public GetStackInstanceResponseBodyStackInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStackInstanceResponseBodyStackInstance setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

}
