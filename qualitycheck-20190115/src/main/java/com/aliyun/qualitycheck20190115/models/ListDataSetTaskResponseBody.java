// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListDataSetTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public ListDataSetTaskResponseBodyData data;

    @NameInMap("DataSize")
    public Integer dataSize;

    @NameInMap("IsAllcomplete")
    public Integer isAllcomplete;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDataSetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetTaskResponseBody self = new ListDataSetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSetTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataSetTaskResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDataSetTaskResponseBody setData(ListDataSetTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataSetTaskResponseBodyData getData() {
        return this.data;
    }

    public ListDataSetTaskResponseBody setDataSize(Integer dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Integer getDataSize() {
        return this.dataSize;
    }

    public ListDataSetTaskResponseBody setIsAllcomplete(Integer isAllcomplete) {
        this.isAllcomplete = isAllcomplete;
        return this;
    }
    public Integer getIsAllcomplete() {
        return this.isAllcomplete;
    }

    public ListDataSetTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataSetTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSetTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataSetTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataSetTaskResponseBodyDataPageTaskInfoDataSets extends TeaModel {
        @NameInMap("dataSets")
        public java.util.List<String> dataSets;

        public static ListDataSetTaskResponseBodyDataPageTaskInfoDataSets build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetTaskResponseBodyDataPageTaskInfoDataSets self = new ListDataSetTaskResponseBodyDataPageTaskInfoDataSets();
            return TeaModel.build(map, self);
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfoDataSets setDataSets(java.util.List<String> dataSets) {
            this.dataSets = dataSets;
            return this;
        }
        public java.util.List<String> getDataSets() {
            return this.dataSets;
        }

    }

    public static class ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoListRuleNameInfo extends TeaModel {
        @NameInMap("Rid")
        public Integer rid;

        @NameInMap("RuleName")
        public String ruleName;

        public static ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoListRuleNameInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoListRuleNameInfo self = new ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoListRuleNameInfo();
            return TeaModel.build(map, self);
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoListRuleNameInfo setRid(Integer rid) {
            this.rid = rid;
            return this;
        }
        public Integer getRid() {
            return this.rid;
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoListRuleNameInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoList extends TeaModel {
        @NameInMap("RuleNameInfo")
        public java.util.List<ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoListRuleNameInfo> ruleNameInfo;

        public static ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoList self = new ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoList();
            return TeaModel.build(map, self);
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoList setRuleNameInfo(java.util.List<ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoListRuleNameInfo> ruleNameInfo) {
            this.ruleNameInfo = ruleNameInfo;
            return this;
        }
        public java.util.List<ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoListRuleNameInfo> getRuleNameInfo() {
            return this.ruleNameInfo;
        }

    }

    public static class ListDataSetTaskResponseBodyDataPageTaskInfo extends TeaModel {
        @NameInMap("DataSetSize")
        public Integer dataSetSize;

        @NameInMap("DataSets")
        public ListDataSetTaskResponseBodyDataPageTaskInfoDataSets dataSets;

        @NameInMap("IsTaskComplete")
        public Boolean isTaskComplete;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("RuleNameInfoList")
        public ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoList ruleNameInfoList;

        @NameInMap("RuleSize")
        public Integer ruleSize;

        @NameInMap("ScheduleRatio")
        public Float scheduleRatio;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskComplete")
        public Boolean taskComplete;

        @NameInMap("TaskId")
        public String taskId;

        public static ListDataSetTaskResponseBodyDataPageTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetTaskResponseBodyDataPageTaskInfo self = new ListDataSetTaskResponseBodyDataPageTaskInfo();
            return TeaModel.build(map, self);
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfo setDataSetSize(Integer dataSetSize) {
            this.dataSetSize = dataSetSize;
            return this;
        }
        public Integer getDataSetSize() {
            return this.dataSetSize;
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfo setDataSets(ListDataSetTaskResponseBodyDataPageTaskInfoDataSets dataSets) {
            this.dataSets = dataSets;
            return this;
        }
        public ListDataSetTaskResponseBodyDataPageTaskInfoDataSets getDataSets() {
            return this.dataSets;
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfo setIsTaskComplete(Boolean isTaskComplete) {
            this.isTaskComplete = isTaskComplete;
            return this;
        }
        public Boolean getIsTaskComplete() {
            return this.isTaskComplete;
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfo setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfo setRuleNameInfoList(ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoList ruleNameInfoList) {
            this.ruleNameInfoList = ruleNameInfoList;
            return this;
        }
        public ListDataSetTaskResponseBodyDataPageTaskInfoRuleNameInfoList getRuleNameInfoList() {
            return this.ruleNameInfoList;
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfo setRuleSize(Integer ruleSize) {
            this.ruleSize = ruleSize;
            return this;
        }
        public Integer getRuleSize() {
            return this.ruleSize;
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfo setScheduleRatio(Float scheduleRatio) {
            this.scheduleRatio = scheduleRatio;
            return this;
        }
        public Float getScheduleRatio() {
            return this.scheduleRatio;
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfo setTaskComplete(Boolean taskComplete) {
            this.taskComplete = taskComplete;
            return this;
        }
        public Boolean getTaskComplete() {
            return this.taskComplete;
        }

        public ListDataSetTaskResponseBodyDataPageTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ListDataSetTaskResponseBodyData extends TeaModel {
        @NameInMap("PageTaskInfo")
        public java.util.List<ListDataSetTaskResponseBodyDataPageTaskInfo> pageTaskInfo;

        public static ListDataSetTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetTaskResponseBodyData self = new ListDataSetTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataSetTaskResponseBodyData setPageTaskInfo(java.util.List<ListDataSetTaskResponseBodyDataPageTaskInfo> pageTaskInfo) {
            this.pageTaskInfo = pageTaskInfo;
            return this;
        }
        public java.util.List<ListDataSetTaskResponseBodyDataPageTaskInfo> getPageTaskInfo() {
            return this.pageTaskInfo;
        }

    }

}
