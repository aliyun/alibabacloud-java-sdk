// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetTranslationTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTranslationTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTranslationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTranslationTaskResponseBody self = new GetTranslationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTranslationTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTranslationTaskResponseBody setData(GetTranslationTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTranslationTaskResponseBodyData getData() {
        return this.data;
    }

    public GetTranslationTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTranslationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTranslationTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTranslationTaskResponseBodyDataConfig extends TeaModel {
        @NameInMap("SecurityLevel")
        public String securityLevel;

        @NameInMap("SourceLanguage")
        public String sourceLanguage;

        @NameInMap("Style")
        public String style;

        @NameInMap("TargetLanguage")
        public String targetLanguage;

        @NameInMap("Template")
        public String template;

        public static GetTranslationTaskResponseBodyDataConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTranslationTaskResponseBodyDataConfig self = new GetTranslationTaskResponseBodyDataConfig();
            return TeaModel.build(map, self);
        }

        public GetTranslationTaskResponseBodyDataConfig setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public GetTranslationTaskResponseBodyDataConfig setSourceLanguage(String sourceLanguage) {
            this.sourceLanguage = sourceLanguage;
            return this;
        }
        public String getSourceLanguage() {
            return this.sourceLanguage;
        }

        public GetTranslationTaskResponseBodyDataConfig setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

        public GetTranslationTaskResponseBodyDataConfig setTargetLanguage(String targetLanguage) {
            this.targetLanguage = targetLanguage;
            return this;
        }
        public String getTargetLanguage() {
            return this.targetLanguage;
        }

        public GetTranslationTaskResponseBodyDataConfig setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

    }

    public static class GetTranslationTaskResponseBodyDataExtractedTerms extends TeaModel {
        @NameInMap("SourceTerm")
        public String sourceTerm;

        @NameInMap("TargetTerm")
        public String targetTerm;

        public static GetTranslationTaskResponseBodyDataExtractedTerms build(java.util.Map<String, ?> map) throws Exception {
            GetTranslationTaskResponseBodyDataExtractedTerms self = new GetTranslationTaskResponseBodyDataExtractedTerms();
            return TeaModel.build(map, self);
        }

        public GetTranslationTaskResponseBodyDataExtractedTerms setSourceTerm(String sourceTerm) {
            this.sourceTerm = sourceTerm;
            return this;
        }
        public String getSourceTerm() {
            return this.sourceTerm;
        }

        public GetTranslationTaskResponseBodyDataExtractedTerms setTargetTerm(String targetTerm) {
            this.targetTerm = targetTerm;
            return this;
        }
        public String getTargetTerm() {
            return this.targetTerm;
        }

    }

    public static class GetTranslationTaskResponseBodyData extends TeaModel {
        @NameInMap("BaseTaskId")
        public String baseTaskId;

        @NameInMap("Config")
        public GetTranslationTaskResponseBodyDataConfig config;

        @NameInMap("CostCredits")
        public Double costCredits;

        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("EstimatedCostCredits")
        public Double estimatedCostCredits;

        @NameInMap("EstimatedTime")
        public Long estimatedTime;

        @NameInMap("ExtractedTerms")
        public java.util.List<GetTranslationTaskResponseBodyDataExtractedTerms> extractedTerms;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FinishedAt")
        public String finishedAt;

        @NameInMap("Fonts")
        public java.util.Map<String, java.util.List<String>> fonts;

        @NameInMap("OrgId")
        public String orgId;

        @NameInMap("OriginalFileName")
        public String originalFileName;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("WordCount")
        public Long wordCount;

        @NameInMap("WorkSpaceId")
        public String workSpaceId;

        public static GetTranslationTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTranslationTaskResponseBodyData self = new GetTranslationTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTranslationTaskResponseBodyData setBaseTaskId(String baseTaskId) {
            this.baseTaskId = baseTaskId;
            return this;
        }
        public String getBaseTaskId() {
            return this.baseTaskId;
        }

        public GetTranslationTaskResponseBodyData setConfig(GetTranslationTaskResponseBodyDataConfig config) {
            this.config = config;
            return this;
        }
        public GetTranslationTaskResponseBodyDataConfig getConfig() {
            return this.config;
        }

        public GetTranslationTaskResponseBodyData setCostCredits(Double costCredits) {
            this.costCredits = costCredits;
            return this;
        }
        public Double getCostCredits() {
            return this.costCredits;
        }

        public GetTranslationTaskResponseBodyData setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public GetTranslationTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetTranslationTaskResponseBodyData setEstimatedCostCredits(Double estimatedCostCredits) {
            this.estimatedCostCredits = estimatedCostCredits;
            return this;
        }
        public Double getEstimatedCostCredits() {
            return this.estimatedCostCredits;
        }

        public GetTranslationTaskResponseBodyData setEstimatedTime(Long estimatedTime) {
            this.estimatedTime = estimatedTime;
            return this;
        }
        public Long getEstimatedTime() {
            return this.estimatedTime;
        }

        public GetTranslationTaskResponseBodyData setExtractedTerms(java.util.List<GetTranslationTaskResponseBodyDataExtractedTerms> extractedTerms) {
            this.extractedTerms = extractedTerms;
            return this;
        }
        public java.util.List<GetTranslationTaskResponseBodyDataExtractedTerms> getExtractedTerms() {
            return this.extractedTerms;
        }

        public GetTranslationTaskResponseBodyData setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public GetTranslationTaskResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetTranslationTaskResponseBodyData setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetTranslationTaskResponseBodyData setFonts(java.util.Map<String, java.util.List<String>> fonts) {
            this.fonts = fonts;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getFonts() {
            return this.fonts;
        }

        public GetTranslationTaskResponseBodyData setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public GetTranslationTaskResponseBodyData setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        public GetTranslationTaskResponseBodyData setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetTranslationTaskResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetTranslationTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTranslationTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTranslationTaskResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetTranslationTaskResponseBodyData setWordCount(Long wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public Long getWordCount() {
            return this.wordCount;
        }

        public GetTranslationTaskResponseBodyData setWorkSpaceId(String workSpaceId) {
            this.workSpaceId = workSpaceId;
            return this;
        }
        public String getWorkSpaceId() {
            return this.workSpaceId;
        }

    }

}
