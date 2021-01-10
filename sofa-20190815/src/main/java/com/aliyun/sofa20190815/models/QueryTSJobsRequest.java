// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobsRequest extends TeaModel {
    @NameInMap("Apps")
    public String apps;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("ExcludedGroupId")
    public Long excludedGroupId;

    @NameInMap("GroupIds")
    public String groupIds;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InvokeType")
    public String invokeType;

    @NameInMap("JobOriginZones")
    public String jobOriginZones;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Priorities")
    public String priorities;

    @NameInMap("TriggerTypes")
    public String triggerTypes;

    @NameInMap("Types")
    public String types;

    @NameInMap("ZoneMode")
    public String zoneMode;

    public static QueryTSJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobsRequest self = new QueryTSJobsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSJobsRequest setApps(String apps) {
        this.apps = apps;
        return this;
    }
    public String getApps() {
        return this.apps;
    }

    public QueryTSJobsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTSJobsRequest setExcludedGroupId(Long excludedGroupId) {
        this.excludedGroupId = excludedGroupId;
        return this;
    }
    public Long getExcludedGroupId() {
        return this.excludedGroupId;
    }

    public QueryTSJobsRequest setGroupIds(String groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public String getGroupIds() {
        return this.groupIds;
    }

    public QueryTSJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSJobsRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public QueryTSJobsRequest setJobOriginZones(String jobOriginZones) {
        this.jobOriginZones = jobOriginZones;
        return this;
    }
    public String getJobOriginZones() {
        return this.jobOriginZones;
    }

    public QueryTSJobsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryTSJobsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSJobsRequest setPriorities(String priorities) {
        this.priorities = priorities;
        return this;
    }
    public String getPriorities() {
        return this.priorities;
    }

    public QueryTSJobsRequest setTriggerTypes(String triggerTypes) {
        this.triggerTypes = triggerTypes;
        return this;
    }
    public String getTriggerTypes() {
        return this.triggerTypes;
    }

    public QueryTSJobsRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

    public QueryTSJobsRequest setZoneMode(String zoneMode) {
        this.zoneMode = zoneMode;
        return this;
    }
    public String getZoneMode() {
        return this.zoneMode;
    }

}
