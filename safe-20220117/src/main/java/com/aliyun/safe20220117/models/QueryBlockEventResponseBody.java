// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryBlockEventResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryBlockEventResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryBlockEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockEventResponseBody self = new QueryBlockEventResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBlockEventResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryBlockEventResponseBody setData(QueryBlockEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBlockEventResponseBodyData getData() {
        return this.data;
    }

    public QueryBlockEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBlockEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBlockEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryBlockEventResponseBodyDataDataInfoEventTimesRule extends TeaModel {
        @NameInMap("Level1")
        public String level1;

        @NameInMap("Level2")
        public String level2;

        @NameInMap("Level3")
        public String level3;

        @NameInMap("Level4")
        public String level4;

        @NameInMap("Level5")
        public String level5;

        @NameInMap("Type")
        public String type;

        public static QueryBlockEventResponseBodyDataDataInfoEventTimesRule build(java.util.Map<String, ?> map) throws Exception {
            QueryBlockEventResponseBodyDataDataInfoEventTimesRule self = new QueryBlockEventResponseBodyDataDataInfoEventTimesRule();
            return TeaModel.build(map, self);
        }

        public QueryBlockEventResponseBodyDataDataInfoEventTimesRule setLevel1(String level1) {
            this.level1 = level1;
            return this;
        }
        public String getLevel1() {
            return this.level1;
        }

        public QueryBlockEventResponseBodyDataDataInfoEventTimesRule setLevel2(String level2) {
            this.level2 = level2;
            return this;
        }
        public String getLevel2() {
            return this.level2;
        }

        public QueryBlockEventResponseBodyDataDataInfoEventTimesRule setLevel3(String level3) {
            this.level3 = level3;
            return this;
        }
        public String getLevel3() {
            return this.level3;
        }

        public QueryBlockEventResponseBodyDataDataInfoEventTimesRule setLevel4(String level4) {
            this.level4 = level4;
            return this;
        }
        public String getLevel4() {
            return this.level4;
        }

        public QueryBlockEventResponseBodyDataDataInfoEventTimesRule setLevel5(String level5) {
            this.level5 = level5;
            return this;
        }
        public String getLevel5() {
            return this.level5;
        }

        public QueryBlockEventResponseBodyDataDataInfoEventTimesRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryBlockEventResponseBodyDataDataInfoEventTimes extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Express")
        public String express;

        @NameInMap("Rule")
        public java.util.List<QueryBlockEventResponseBodyDataDataInfoEventTimesRule> rule;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("ruleId")
        public Long ruleId;

        public static QueryBlockEventResponseBodyDataDataInfoEventTimes build(java.util.Map<String, ?> map) throws Exception {
            QueryBlockEventResponseBodyDataDataInfoEventTimes self = new QueryBlockEventResponseBodyDataDataInfoEventTimes();
            return TeaModel.build(map, self);
        }

        public QueryBlockEventResponseBodyDataDataInfoEventTimes setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryBlockEventResponseBodyDataDataInfoEventTimes setExpress(String express) {
            this.express = express;
            return this;
        }
        public String getExpress() {
            return this.express;
        }

        public QueryBlockEventResponseBodyDataDataInfoEventTimes setRule(java.util.List<QueryBlockEventResponseBodyDataDataInfoEventTimesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<QueryBlockEventResponseBodyDataDataInfoEventTimesRule> getRule() {
            return this.rule;
        }

        public QueryBlockEventResponseBodyDataDataInfoEventTimes setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryBlockEventResponseBodyDataDataInfoEventTimes setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class QueryBlockEventResponseBodyDataDataInfoLevelType extends TeaModel {
        @NameInMap("label")
        public String label;

        @NameInMap("value")
        public Integer value;

        public static QueryBlockEventResponseBodyDataDataInfoLevelType build(java.util.Map<String, ?> map) throws Exception {
            QueryBlockEventResponseBodyDataDataInfoLevelType self = new QueryBlockEventResponseBodyDataDataInfoLevelType();
            return TeaModel.build(map, self);
        }

        public QueryBlockEventResponseBodyDataDataInfoLevelType setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryBlockEventResponseBodyDataDataInfoLevelType setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class QueryBlockEventResponseBodyDataDataInfo extends TeaModel {
        @NameInMap("EmpId")
        public String empId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("EventTimes")
        public java.util.List<QueryBlockEventResponseBodyDataDataInfoEventTimes> eventTimes;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        @NameInMap("levelType")
        public QueryBlockEventResponseBodyDataDataInfoLevelType levelType;

        @NameInMap("versionId")
        public Long versionId;

        public static QueryBlockEventResponseBodyDataDataInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryBlockEventResponseBodyDataDataInfo self = new QueryBlockEventResponseBodyDataDataInfo();
            return TeaModel.build(map, self);
        }

        public QueryBlockEventResponseBodyDataDataInfo setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public QueryBlockEventResponseBodyDataDataInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryBlockEventResponseBodyDataDataInfo setEventTimes(java.util.List<QueryBlockEventResponseBodyDataDataInfoEventTimes> eventTimes) {
            this.eventTimes = eventTimes;
            return this;
        }
        public java.util.List<QueryBlockEventResponseBodyDataDataInfoEventTimes> getEventTimes() {
            return this.eventTimes;
        }

        public QueryBlockEventResponseBodyDataDataInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryBlockEventResponseBodyDataDataInfo setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryBlockEventResponseBodyDataDataInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryBlockEventResponseBodyDataDataInfo setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QueryBlockEventResponseBodyDataDataInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryBlockEventResponseBodyDataDataInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryBlockEventResponseBodyDataDataInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryBlockEventResponseBodyDataDataInfo setLevelType(QueryBlockEventResponseBodyDataDataInfoLevelType levelType) {
            this.levelType = levelType;
            return this;
        }
        public QueryBlockEventResponseBodyDataDataInfoLevelType getLevelType() {
            return this.levelType;
        }

        public QueryBlockEventResponseBodyDataDataInfo setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

    }

    public static class QueryBlockEventResponseBodyDataPagination extends TeaModel {
        @NameInMap("Limit")
        public Integer limit;

        @NameInMap("Page")
        public Integer page;

        public static QueryBlockEventResponseBodyDataPagination build(java.util.Map<String, ?> map) throws Exception {
            QueryBlockEventResponseBodyDataPagination self = new QueryBlockEventResponseBodyDataPagination();
            return TeaModel.build(map, self);
        }

        public QueryBlockEventResponseBodyDataPagination setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public QueryBlockEventResponseBodyDataPagination setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

    public static class QueryBlockEventResponseBodyData extends TeaModel {
        @NameInMap("DataInfo")
        public java.util.List<QueryBlockEventResponseBodyDataDataInfo> dataInfo;

        @NameInMap("ExtraInfo")
        public java.util.Map<String, String> extraInfo;

        @NameInMap("Pagination")
        public QueryBlockEventResponseBodyDataPagination pagination;

        @NameInMap("Total")
        public Long total;

        public static QueryBlockEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBlockEventResponseBodyData self = new QueryBlockEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBlockEventResponseBodyData setDataInfo(java.util.List<QueryBlockEventResponseBodyDataDataInfo> dataInfo) {
            this.dataInfo = dataInfo;
            return this;
        }
        public java.util.List<QueryBlockEventResponseBodyDataDataInfo> getDataInfo() {
            return this.dataInfo;
        }

        public QueryBlockEventResponseBodyData setExtraInfo(java.util.Map<String, String> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, String> getExtraInfo() {
            return this.extraInfo;
        }

        public QueryBlockEventResponseBodyData setPagination(QueryBlockEventResponseBodyDataPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public QueryBlockEventResponseBodyDataPagination getPagination() {
            return this.pagination;
        }

        public QueryBlockEventResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
