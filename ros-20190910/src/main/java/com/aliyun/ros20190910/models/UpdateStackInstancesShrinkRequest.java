// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackInstancesShrinkRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("AccountIds")
    public String accountIdsShrink;

    @NameInMap("RegionIds")
    public String regionIdsShrink;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OperationDescription")
    public String operationDescription;

    @NameInMap("OperationPreferences")
    public String operationPreferencesShrink;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("ParameterOverrides")
    public java.util.List<UpdateStackInstancesShrinkRequestParameterOverrides> parameterOverrides;

    public static UpdateStackInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackInstancesShrinkRequest self = new UpdateStackInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStackInstancesShrinkRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public UpdateStackInstancesShrinkRequest setAccountIdsShrink(String accountIdsShrink) {
        this.accountIdsShrink = accountIdsShrink;
        return this;
    }
    public String getAccountIdsShrink() {
        return this.accountIdsShrink;
    }

    public UpdateStackInstancesShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

    public UpdateStackInstancesShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackInstancesShrinkRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public UpdateStackInstancesShrinkRequest setOperationPreferencesShrink(String operationPreferencesShrink) {
        this.operationPreferencesShrink = operationPreferencesShrink;
        return this;
    }
    public String getOperationPreferencesShrink() {
        return this.operationPreferencesShrink;
    }

    public UpdateStackInstancesShrinkRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public UpdateStackInstancesShrinkRequest setParameterOverrides(java.util.List<UpdateStackInstancesShrinkRequestParameterOverrides> parameterOverrides) {
        this.parameterOverrides = parameterOverrides;
        return this;
    }
    public java.util.List<UpdateStackInstancesShrinkRequestParameterOverrides> getParameterOverrides() {
        return this.parameterOverrides;
    }

    public static class UpdateStackInstancesShrinkRequestParameterOverrides extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateStackInstancesShrinkRequestParameterOverrides build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackInstancesShrinkRequestParameterOverrides self = new UpdateStackInstancesShrinkRequestParameterOverrides();
            return TeaModel.build(map, self);
        }

        public UpdateStackInstancesShrinkRequestParameterOverrides setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateStackInstancesShrinkRequestParameterOverrides setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
