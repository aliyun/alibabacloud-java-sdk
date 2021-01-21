// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("AccountIds")
    public java.util.Map<String, ?> accountIds;

    @NameInMap("RegionIds")
    public java.util.Map<String, ?> regionIds;

    @NameInMap("RetainStacks")
    public Boolean retainStacks;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OperationDescription")
    public String operationDescription;

    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    public static DeleteStackInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackInstancesRequest self = new DeleteStackInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStackInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteStackInstancesRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public DeleteStackInstancesRequest setAccountIds(java.util.Map<String, ?> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.Map<String, ?> getAccountIds() {
        return this.accountIds;
    }

    public DeleteStackInstancesRequest setRegionIds(java.util.Map<String, ?> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.Map<String, ?> getRegionIds() {
        return this.regionIds;
    }

    public DeleteStackInstancesRequest setRetainStacks(Boolean retainStacks) {
        this.retainStacks = retainStacks;
        return this;
    }
    public Boolean getRetainStacks() {
        return this.retainStacks;
    }

    public DeleteStackInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteStackInstancesRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public DeleteStackInstancesRequest setOperationPreferences(java.util.Map<String, ?> operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }
    public java.util.Map<String, ?> getOperationPreferences() {
        return this.operationPreferences;
    }

}
