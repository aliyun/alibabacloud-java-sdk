// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteRouteStrategyRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteRouteStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteStrategyRequest self = new DeleteRouteStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteStrategyRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteRouteStrategyRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public DeleteRouteStrategyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteRouteStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
