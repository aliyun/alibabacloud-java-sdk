// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class BatchDeleteRouteStrategyRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("JobIdList")
    public java.util.List<Long> jobIdList;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    public static BatchDeleteRouteStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteRouteStrategyRequest self = new BatchDeleteRouteStrategyRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteRouteStrategyRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BatchDeleteRouteStrategyRequest setJobIdList(java.util.List<Long> jobIdList) {
        this.jobIdList = jobIdList;
        return this;
    }
    public java.util.List<Long> getJobIdList() {
        return this.jobIdList;
    }

    public BatchDeleteRouteStrategyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BatchDeleteRouteStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
