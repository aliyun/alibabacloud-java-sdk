// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetTranslationTaskResponseBody extends TeaModel {
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
    public GetTranslationTaskResponseBodyData data;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDD51FD8-93E0-5161-BCA6-38A8393F26D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
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
        /**
         * <p>The security level.</p>
         * <ul>
         * <li>public: Standard confidentiality.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        /**
         * <p>The source file language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("SourceLanguage")
        public String sourceLanguage;

        /**
         * <p>The translation style. This parameter takes effect only when the translation file is a PPT file.</p>
         * <ul>
         * <li>normal: Standard. The original information is fully preserved.</li>
         * <li>minimal: More concise information with a more visually appealing layout.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>minimal</p>
         */
        @NameInMap("Style")
        public String style;

        /**
         * <p>The target language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("TargetLanguage")
        public String targetLanguage;

        /**
         * <p>The translation template.</p>
         * <ul>
         * <li>common: General-purpose.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
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
        /**
         * <p>The source term.</p>
         * 
         * <strong>example:</strong>
         * <p>puppy</p>
         */
        @NameInMap("SourceTerm")
        public String sourceTerm;

        /**
         * <p>The translated term.</p>
         * 
         * <strong>example:</strong>
         * <p>dog</p>
         */
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
        /**
         * <p>The translation task ID of a previously submitted task. This parameter is passed in when resubmitting a translation task.</p>
         * 
         * <strong>example:</strong>
         * <p>f9c35b0453b</p>
         */
        @NameInMap("BaseTaskId")
        public String baseTaskId;

        /**
         * <p>The translation configuration.</p>
         */
        @NameInMap("Config")
        public GetTranslationTaskResponseBodyDataConfig config;

        /**
         * <p>The credits consumed by this task.</p>
         * 
         * <strong>example:</strong>
         * <p>2.5510</p>
         */
        @NameInMap("CostCredits")
        public Double costCredits;

        /**
         * <p>The time consumed, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("CostTime")
        public Long costTime;

        /**
         * <p>The error message when the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The estimated credits to be consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>2.5510</p>
         */
        @NameInMap("EstimatedCostCredits")
        public Double estimatedCostCredits;

        /**
         * <p>The estimated translation time, in <strong>seconds</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("EstimatedTime")
        public Long estimatedTime;

        /**
         * <p>The terms used in this task.</p>
         */
        @NameInMap("ExtractedTerms")
        public java.util.List<GetTranslationTaskResponseBodyDataExtractedTerms> extractedTerms;

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
         * <p>The task completion time, expressed as a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1774147442</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <p>The languages that support font modification and the corresponding font lists. The key of the map identifies the language type. Currently supported languages include English, French, Indonesian, and Japanese.</p>
         */
        @NameInMap("Fonts")
        public java.util.Map<String, java.util.List<String>> fonts;

        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org_e5b74*****9c94209</p>
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
         * <p>0</p>
         */
        @NameInMap("PageCount")
        public Long pageCount;

        /**
         * <p>The progress, expressed as a percentage number.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>PROCESSING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The translation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f9c35b0453b</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type.</p>
         * <ul>
         * <li>DOCUMENT: Document type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DOCUMENT</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The word count of the uploaded document.</p>
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
         * <p>c2b898f******c985c</p>
         */
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
