// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingPoliciesParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // nodeGroupId
    @NameInMap("nodeGroupId")
    public String nodeGroupId;

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

    // scalingPolicyStatus
    @NameInMap("scalingPolicyStatus")
    public String scalingPolicyStatus;

    public static ListAutoScalingPoliciesParam build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingPoliciesParam self = new ListAutoScalingPoliciesParam();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingPoliciesParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAutoScalingPoliciesParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ListAutoScalingPoliciesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListAutoScalingPoliciesParam setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAutoScalingPoliciesParam setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAutoScalingPoliciesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListAutoScalingPoliciesParam setScalingPolicyStatus(String scalingPolicyStatus) {
        this.scalingPolicyStatus = scalingPolicyStatus;
        return this;
    }
    public String getScalingPolicyStatus() {
        return this.scalingPolicyStatus;
    }

}
