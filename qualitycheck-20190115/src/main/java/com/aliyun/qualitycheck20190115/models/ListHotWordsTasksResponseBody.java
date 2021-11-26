// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListHotWordsTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public ListHotWordsTasksResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListHotWordsTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotWordsTasksResponseBody self = new ListHotWordsTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotWordsTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotWordsTasksResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListHotWordsTasksResponseBody setData(ListHotWordsTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHotWordsTasksResponseBodyData getData() {
        return this.data;
    }

    public ListHotWordsTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotWordsTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHotWordsTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHotWordsTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotWordsTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam extends TeaModel {
        @NameInMap("DataSetIds")
        public String dataSetIds;

        @NameInMap("DialogueId")
        public Long dialogueId;

        @NameInMap("EndIndex")
        public Integer endIndex;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Role")
        public Integer role;

        @NameInMap("SourceType")
        public Integer sourceType;

        @NameInMap("StartIndex")
        public Integer startIndex;

        @NameInMap("StartTime")
        public String startTime;

        public static ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam build(java.util.Map<String, ?> map) throws Exception {
            ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam self = new ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam();
            return TeaModel.build(map, self);
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam setDataSetIds(String dataSetIds) {
            this.dataSetIds = dataSetIds;
            return this;
        }
        public String getDataSetIds() {
            return this.dataSetIds;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam setDialogueId(Long dialogueId) {
            this.dialogueId = dialogueId;
            return this;
        }
        public Long getDialogueId() {
            return this.dialogueId;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam setEndIndex(Integer endIndex) {
            this.endIndex = endIndex;
            return this;
        }
        public Integer getEndIndex() {
            return this.endIndex;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam setSourceType(Integer sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Integer getSourceType() {
            return this.sourceType;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam setStartIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }
        public Integer getStartIndex() {
            return this.startIndex;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListHotWordsTasksResponseBodyDataHotWordsTaskPoWordsParam extends TeaModel {
        @NameInMap("Excludes")
        public String excludes;

        @NameInMap("ExtraConfigId")
        public Long extraConfigId;

        @NameInMap("Includes")
        public String includes;

        public static ListHotWordsTasksResponseBodyDataHotWordsTaskPoWordsParam build(java.util.Map<String, ?> map) throws Exception {
            ListHotWordsTasksResponseBodyDataHotWordsTaskPoWordsParam self = new ListHotWordsTasksResponseBodyDataHotWordsTaskPoWordsParam();
            return TeaModel.build(map, self);
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoWordsParam setExcludes(String excludes) {
            this.excludes = excludes;
            return this;
        }
        public String getExcludes() {
            return this.excludes;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoWordsParam setExtraConfigId(Long extraConfigId) {
            this.extraConfigId = extraConfigId;
            return this;
        }
        public Long getExtraConfigId() {
            return this.extraConfigId;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoWordsParam setIncludes(String includes) {
            this.includes = includes;
            return this;
        }
        public String getIncludes() {
            return this.includes;
        }

    }

    public static class ListHotWordsTasksResponseBodyDataHotWordsTaskPo extends TeaModel {
        @NameInMap("DialogueParam")
        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam dialogueParam;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        @NameInMap("LastExecutionTime")
        public String lastExecutionTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskConfigId")
        public Long taskConfigId;

        @NameInMap("TimeInterval")
        public Integer timeInterval;

        @NameInMap("TimeUnit")
        public Integer timeUnit;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("WordsParam")
        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoWordsParam wordsParam;

        public static ListHotWordsTasksResponseBodyDataHotWordsTaskPo build(java.util.Map<String, ?> map) throws Exception {
            ListHotWordsTasksResponseBodyDataHotWordsTaskPo self = new ListHotWordsTasksResponseBodyDataHotWordsTaskPo();
            return TeaModel.build(map, self);
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setDialogueParam(ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam dialogueParam) {
            this.dialogueParam = dialogueParam;
            return this;
        }
        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoDialogueParam getDialogueParam() {
            return this.dialogueParam;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setLastExecutionTime(String lastExecutionTime) {
            this.lastExecutionTime = lastExecutionTime;
            return this;
        }
        public String getLastExecutionTime() {
            return this.lastExecutionTime;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setTaskConfigId(Long taskConfigId) {
            this.taskConfigId = taskConfigId;
            return this;
        }
        public Long getTaskConfigId() {
            return this.taskConfigId;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setTimeUnit(Integer timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public Integer getTimeUnit() {
            return this.timeUnit;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListHotWordsTasksResponseBodyDataHotWordsTaskPo setWordsParam(ListHotWordsTasksResponseBodyDataHotWordsTaskPoWordsParam wordsParam) {
            this.wordsParam = wordsParam;
            return this;
        }
        public ListHotWordsTasksResponseBodyDataHotWordsTaskPoWordsParam getWordsParam() {
            return this.wordsParam;
        }

    }

    public static class ListHotWordsTasksResponseBodyData extends TeaModel {
        @NameInMap("HotWordsTaskPo")
        public java.util.List<ListHotWordsTasksResponseBodyDataHotWordsTaskPo> hotWordsTaskPo;

        public static ListHotWordsTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotWordsTasksResponseBodyData self = new ListHotWordsTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotWordsTasksResponseBodyData setHotWordsTaskPo(java.util.List<ListHotWordsTasksResponseBodyDataHotWordsTaskPo> hotWordsTaskPo) {
            this.hotWordsTaskPo = hotWordsTaskPo;
            return this;
        }
        public java.util.List<ListHotWordsTasksResponseBodyDataHotWordsTaskPo> getHotWordsTaskPo() {
            return this.hotWordsTaskPo;
        }

    }

}
