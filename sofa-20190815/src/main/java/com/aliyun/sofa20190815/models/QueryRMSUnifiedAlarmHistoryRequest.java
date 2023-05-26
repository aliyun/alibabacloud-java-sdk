// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSUnifiedAlarmHistoryRequest extends TeaModel {
    @NameInMap("AlarmLevel")
    public Long alarmLevel;

    @NameInMap("AlarmStackInfoJsonStr")
    public String alarmStackInfoJsonStr;

    @NameInMap("AlarmTarget")
    public String alarmTarget;

    @NameInMap("AlarmTargetType")
    public String alarmTargetType;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("End")
    public Long end;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Start")
    public Long start;

    @NameInMap("Status")
    public Long status;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static QueryRMSUnifiedAlarmHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSUnifiedAlarmHistoryRequest self = new QueryRMSUnifiedAlarmHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryRMSUnifiedAlarmHistoryRequest setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public QueryRMSUnifiedAlarmHistoryRequest setAlarmStackInfoJsonStr(String alarmStackInfoJsonStr) {
        this.alarmStackInfoJsonStr = alarmStackInfoJsonStr;
        return this;
    }
    public String getAlarmStackInfoJsonStr() {
        return this.alarmStackInfoJsonStr;
    }

    public QueryRMSUnifiedAlarmHistoryRequest setAlarmTarget(String alarmTarget) {
        this.alarmTarget = alarmTarget;
        return this;
    }
    public String getAlarmTarget() {
        return this.alarmTarget;
    }

    public QueryRMSUnifiedAlarmHistoryRequest setAlarmTargetType(String alarmTargetType) {
        this.alarmTargetType = alarmTargetType;
        return this;
    }
    public String getAlarmTargetType() {
        return this.alarmTargetType;
    }

    public QueryRMSUnifiedAlarmHistoryRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryRMSUnifiedAlarmHistoryRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public QueryRMSUnifiedAlarmHistoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRMSUnifiedAlarmHistoryRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryRMSUnifiedAlarmHistoryRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryRMSUnifiedAlarmHistoryRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
