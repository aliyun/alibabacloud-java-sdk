// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingRulesParam extends TeaModel {
    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // pageNumber
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Integer pageSize;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // scalingPolicyId
    @NameInMap("scalingPolicyId")
    public String scalingPolicyId;

    // scalingRuleStatus
    @NameInMap("scalingRuleStatus")
    public String scalingRuleStatus;

    // scalingRuleType
    @NameInMap("scalingRuleType")
    public String scalingRuleType;

    public static ListAutoScalingRulesParam build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingRulesParam self = new ListAutoScalingRulesParam();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingRulesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListAutoScalingRulesParam setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAutoScalingRulesParam setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAutoScalingRulesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListAutoScalingRulesParam setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }
    public String getScalingPolicyId() {
        return this.scalingPolicyId;
    }

    public ListAutoScalingRulesParam setScalingRuleStatus(String scalingRuleStatus) {
        this.scalingRuleStatus = scalingRuleStatus;
        return this;
    }
    public String getScalingRuleStatus() {
        return this.scalingRuleStatus;
    }

    public ListAutoScalingRulesParam setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

}
