// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetAutoScalingActivityParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // 弹性伸缩活动ID
    @NameInMap("scalingActivityId")
    public String scalingActivityId;

    public static GetAutoScalingActivityParam build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingActivityParam self = new GetAutoScalingActivityParam();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingActivityParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetAutoScalingActivityParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public GetAutoScalingActivityParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public GetAutoScalingActivityParam setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
