// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSUnifiedAlarmEventRequest extends TeaModel {
    @NameInMap("AlarmLevel")
    public Long alarmLevel;

    @NameInMap("AlarmRuleId")
    public Long alarmRuleId;

    @NameInMap("AlarmRuleUuid")
    public String alarmRuleUuid;

    @NameInMap("AlarmStackInfoJsonStr")
    public String alarmStackInfoJsonStr;

    @NameInMap("AlarmStatusRepeatList")
    public java.util.List<Long> alarmStatusRepeatList;

    @NameInMap("AlarmTargetType")
    public String alarmTargetType;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Status")
    public Long status;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static QueryRMSUnifiedAlarmEventRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSUnifiedAlarmEventRequest self = new QueryRMSUnifiedAlarmEventRequest();
        return TeaModel.build(map, self);
    }

    public QueryRMSUnifiedAlarmEventRequest setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public QueryRMSUnifiedAlarmEventRequest setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public QueryRMSUnifiedAlarmEventRequest setAlarmRuleUuid(String alarmRuleUuid) {
        this.alarmRuleUuid = alarmRuleUuid;
        return this;
    }
    public String getAlarmRuleUuid() {
        return this.alarmRuleUuid;
    }

    public QueryRMSUnifiedAlarmEventRequest setAlarmStackInfoJsonStr(String alarmStackInfoJsonStr) {
        this.alarmStackInfoJsonStr = alarmStackInfoJsonStr;
        return this;
    }
    public String getAlarmStackInfoJsonStr() {
        return this.alarmStackInfoJsonStr;
    }

    public QueryRMSUnifiedAlarmEventRequest setAlarmStatusRepeatList(java.util.List<Long> alarmStatusRepeatList) {
        this.alarmStatusRepeatList = alarmStatusRepeatList;
        return this;
    }
    public java.util.List<Long> getAlarmStatusRepeatList() {
        return this.alarmStatusRepeatList;
    }

    public QueryRMSUnifiedAlarmEventRequest setAlarmTargetType(String alarmTargetType) {
        this.alarmTargetType = alarmTargetType;
        return this;
    }
    public String getAlarmTargetType() {
        return this.alarmTargetType;
    }

    public QueryRMSUnifiedAlarmEventRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryRMSUnifiedAlarmEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryRMSUnifiedAlarmEventRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryRMSUnifiedAlarmEventRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRMSUnifiedAlarmEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryRMSUnifiedAlarmEventRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryRMSUnifiedAlarmEventRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
