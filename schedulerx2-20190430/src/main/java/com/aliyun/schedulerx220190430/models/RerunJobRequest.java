// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class RerunJobRequest extends TeaModel {
    @NameInMap("DataTime")
    public String dataTime;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespaceSource")
    public String namespaceSource;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartDate")
    public Long startDate;

    public static RerunJobRequest build(java.util.Map<String, ?> map) throws Exception {
        RerunJobRequest self = new RerunJobRequest();
        return TeaModel.build(map, self);
    }

    public RerunJobRequest setDataTime(String dataTime) {
        this.dataTime = dataTime;
        return this;
    }
    public String getDataTime() {
        return this.dataTime;
    }

    public RerunJobRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public RerunJobRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RerunJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public RerunJobRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public RerunJobRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public RerunJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RerunJobRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
