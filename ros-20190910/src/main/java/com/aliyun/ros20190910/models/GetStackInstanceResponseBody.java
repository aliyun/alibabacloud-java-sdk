// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B8A6B693-82C8-419D-8796-DE99EC33CFF9</p>
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
         * 
         * <strong>example:</strong>
         * <p>Amount</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter that is used to override a specific parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>151266687691****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The time when the most recent successful drift detection was performed on the stack group.</p>
         * <blockquote>
         * <p>This parameter is returned only if drift detection is performed on the stack group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-02-27T07:47:47</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        /**
         * <p>The outputs of the stack.</p>
         * <blockquote>
         * <p> This parameter is returned if OutputOption is set to Enabled.</p>
         * </blockquote>
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
         * <blockquote>
         * <p>This parameter is returned only if the stack group is granted service-managed permissions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fd-4PvlVLOL8v</p>
         */
        @NameInMap("RdFolderId")
        public String rdFolderId;

        /**
         * <p>The region ID of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The state of the stack when the most recent successful drift detection was performed on the stack group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DRIFTED: The stack has drifted.</li>
         * <li>NOT_CHECKED: No successful drift detection is performed on the stack.</li>
         * <li>IN_SYNC: The stack is being synchronized.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only if drift detection is performed on the stack group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IN_SYNC</p>
         */
        @NameInMap("StackDriftStatus")
        public String stackDriftStatus;

        /**
         * <p>The ID of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>fd0ddef9-9540-4b42-a464-94f77835****</p>
         */
        @NameInMap("StackGroupId")
        public String stackGroupId;

        /**
         * <p>The name of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStackGroup</p>
         */
        @NameInMap("StackGroupName")
        public String stackGroupName;

        /**
         * <p>The stack ID.</p>
         * <blockquote>
         * <p>This parameter is returned only if the stack is in the CURRENT state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>35ad60e3-6a92-42d8-8812-f0700d45****</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The state of the stack.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>CURRENT: The stack is up-to-date with the stack group.</p>
         * </li>
         * <li><p>OUTDATED: The stack is not up-to-date with the stack group. Stacks are in the OUTDATED state due to the following possible reasons:</p>
         * <ul>
         * <li>When the CreateStackInstances operation is called to create stacks, the stacks fail to be created.</li>
         * <li>When the UpdateStackInstances or UpdateStackGroup operation is called to update stacks, the stacks fail to be updated, or only specific stacks are updated.</li>
         * <li>The creation or update operation is not complete.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CURRENT</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the stack instance is in the OUTDATED state.</p>
         * <blockquote>
         * <p>This parameter is returned only if the stack instance is in the OUTDATED state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>User initiated stop</p>
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
