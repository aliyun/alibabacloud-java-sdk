// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class ListTranslationTasksResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public ListTranslationTasksResponseBodyData data;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50ABF118-2F9D-51DF-B1FB-1E389817DC47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
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
        /**
         * <p>The task completion time, in 13-digit timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1782459562000</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The credits consumed by this task.</p>
         * 
         * <strong>example:</strong>
         * <p>81.2992</p>
         */
        @NameInMap("CostCredits")
        public Double costCredits;

        /**
         * <p>The time consumed, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>196</p>
         */
        @NameInMap("CostTime")
        public Long costTime;

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acc_93****c936</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creator name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:tes_account@test.com">tes_account@test.com</a></p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The error message when the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>device offline</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The parsed file format.</p>
         * 
         * <strong>example:</strong>
         * <p>PPTX</p>
         */
        @NameInMap("FileFormat")
        public String fileFormat;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>translated_a_file.pptx</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The task creation time, in 13-digit timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1782459562000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org_c6******cdc2ce7</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The source file address.</p>
         * 
         * <strong>example:</strong>
         * <p>translated_a_file.pptx</p>
         */
        @NameInMap("OriginalFileName")
        public String originalFileName;

        /**
         * <p>The page count of the uploaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("PageCount")
        public Long pageCount;

        /**
         * <p>The task progress.</p>
         * 
         * <strong>example:</strong>
         * <p>61</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The language of the source file.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("SourceLanguage")
        public String sourceLanguage;

        /**
         * <p>The task start time, in 13-digit timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1782459562000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>CANCELLED: Cancelled.</li>
         * <li>COMPLETED: Completed.</li>
         * <li>FAILED: Failed.</li>
         * <li>PROCESSING: Processing.</li>
         * <li>PENDING: Pending.</li>
         * <li>ANALYZED: Analyzed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CANCELLED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The target language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("TargetLanguage")
        public String targetLanguage;

        /**
         * <p>The translation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f9c35b0453b</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>DOCUMENT: document type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DOCUMENT</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The translation template. Valid values:</p>
         * <ul>
         * <li>common: General.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The word count of the uploaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>1600</p>
         */
        @NameInMap("WordCount")
        public Long wordCount;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6458351*****0cc5</p>
         */
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
        /**
         * <p>The data list.</p>
         */
        @NameInMap("List")
        public java.util.List<ListTranslationTasksResponseBodyDataList> list;

        /**
         * <p>The maximum number of results returned per request when using the NextToken-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>Indicates whether a token exists for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
         * <li>If <strong>NextToken</strong> has a value, the value is the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AAAAAVpfrV4aVmra0dxbtRB74lmSGzegoejeIqxIET/WdX50</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
