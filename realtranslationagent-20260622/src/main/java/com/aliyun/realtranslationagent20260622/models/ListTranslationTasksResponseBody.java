// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class ListTranslationTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListTranslationTasksResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListTranslationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTranslationTasksResponseBody self = new ListTranslationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTranslationTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTranslationTasksResponseBody setData(ListTranslationTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTranslationTasksResponseBodyData getData() {
        return this.data;
    }

    public ListTranslationTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTranslationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTranslationTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTranslationTasksResponseBodyDataList extends TeaModel {
        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("CostCredits")
        public Double costCredits;

        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("OrgId")
        public String orgId;

        @NameInMap("OriginalFileName")
        public String originalFileName;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("SourceLanguage")
        public String sourceLanguage;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetLanguage")
        public String targetLanguage;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("Template")
        public String template;

        @NameInMap("WordCount")
        public Long wordCount;

        @NameInMap("WorkSpaceId")
        public String workSpaceId;

        public static ListTranslationTasksResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListTranslationTasksResponseBodyDataList self = new ListTranslationTasksResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListTranslationTasksResponseBodyDataList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListTranslationTasksResponseBodyDataList setCostCredits(Double costCredits) {
            this.costCredits = costCredits;
            return this;
        }
        public Double getCostCredits() {
            return this.costCredits;
        }

        public ListTranslationTasksResponseBodyDataList setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public ListTranslationTasksResponseBodyDataList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListTranslationTasksResponseBodyDataList setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListTranslationTasksResponseBodyDataList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListTranslationTasksResponseBodyDataList setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public ListTranslationTasksResponseBodyDataList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListTranslationTasksResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTranslationTasksResponseBodyDataList setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public ListTranslationTasksResponseBodyDataList setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        public ListTranslationTasksResponseBodyDataList setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public ListTranslationTasksResponseBodyDataList setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListTranslationTasksResponseBodyDataList setSourceLanguage(String sourceLanguage) {
            this.sourceLanguage = sourceLanguage;
            return this;
        }
        public String getSourceLanguage() {
            return this.sourceLanguage;
        }

        public ListTranslationTasksResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListTranslationTasksResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTranslationTasksResponseBodyDataList setTargetLanguage(String targetLanguage) {
            this.targetLanguage = targetLanguage;
            return this;
        }
        public String getTargetLanguage() {
            return this.targetLanguage;
        }

        public ListTranslationTasksResponseBodyDataList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTranslationTasksResponseBodyDataList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListTranslationTasksResponseBodyDataList setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListTranslationTasksResponseBodyDataList setWordCount(Long wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public Long getWordCount() {
            return this.wordCount;
        }

        public ListTranslationTasksResponseBodyDataList setWorkSpaceId(String workSpaceId) {
            this.workSpaceId = workSpaceId;
            return this;
        }
        public String getWorkSpaceId() {
            return this.workSpaceId;
        }

    }

    public static class ListTranslationTasksResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListTranslationTasksResponseBodyDataList> list;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("Total")
        public Long total;

        public static ListTranslationTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTranslationTasksResponseBodyData self = new ListTranslationTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTranslationTasksResponseBodyData setList(java.util.List<ListTranslationTasksResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListTranslationTasksResponseBodyDataList> getList() {
            return this.list;
        }

        public ListTranslationTasksResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListTranslationTasksResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListTranslationTasksResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
