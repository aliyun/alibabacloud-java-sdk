// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ContentPlanGenerationTask extends TeaModel {
    /**
     * <p>The analysis conclusions, returned only after the analysis task succeeds.</p>
     */
    @NameInMap("Analysis")
    public ContentPlanGenerationTaskAnalysis analysis;

    /**
     * <p>The ID of the analysis task on which the scheduling task is based.</p>
     * 
     * <strong>example:</strong>
     * <p>cpt_1a2b3c4d5e6f708192a3b4c5d6e7f809</p>
     */
    @NameInMap("AnalysisTaskId")
    public String analysisTaskId;

    /**
     * <p>The current configuration version of the workspace when the analysis is initiated.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("ConfigRevision")
    public Long configRevision;

    /**
     * <p>The ID of the GEO diagnostic task used by the analysis node.</p>
     * 
     * <strong>example:</strong>
     * <p>1f2e3d4c-5b6a-4798-8a9b-c0d1e2f3a4b5</p>
     */
    @NameInMap("DiagnosisTaskId")
    public String diagnosisTaskId;

    /**
     * <p>The error code for the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>CONTENT_PLAN_AGENT_TIMEOUT</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message for the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>Content plan generation timed out. Please try again later</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the content plan generated after the scheduling task succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>plan_3f7a1c2e9b7d4a5f8c0e1d2b3a4c5d6e</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The task progress, ranging from 0 to 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The ID of the workspace, which refers to the GEO workspace for brand marketing, namely the appWorkspaceId.</p>
     * 
     * <strong>example:</strong>
     * <p>d4e5f60718293a4b5c6d7e8f90a1b2c3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The workspace configuration version on which the diagnostic report is based. The analysis, scheduling, and article generation processes always read this version.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("ReportConfigRevision")
    public Long reportConfigRevision;

    /**
     * <p>Indicates whether the diagnostic report is generated based on an outdated configuration. If the value is true, the frontend should prompt the user.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("StaleConfig")
    public Boolean staleConfig;

    /**
     * <p>The task status.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCEEDED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The submission time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800000</p>
     */
    @NameInMap("SubmittedAt")
    public Long submittedAt;

    /**
     * <p>The ID of the generation task.</p>
     * 
     * <strong>example:</strong>
     * <p>cpt_9b7d4a5f8c0e1d2b3a4c5d6e3f7a1c2e</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task type. Valid values: ANALYSIS and SCHEDULE.</p>
     * 
     * <strong>example:</strong>
     * <p>SCHEDULE</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The last update time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660900000</p>
     */
    @NameInMap("UpdatedAt")
    public Long updatedAt;

    public static ContentPlanGenerationTask build(java.util.Map<String, ?> map) throws Exception {
        ContentPlanGenerationTask self = new ContentPlanGenerationTask();
        return TeaModel.build(map, self);
    }

    public ContentPlanGenerationTask setAnalysis(ContentPlanGenerationTaskAnalysis analysis) {
        this.analysis = analysis;
        return this;
    }
    public ContentPlanGenerationTaskAnalysis getAnalysis() {
        return this.analysis;
    }

    public ContentPlanGenerationTask setAnalysisTaskId(String analysisTaskId) {
        this.analysisTaskId = analysisTaskId;
        return this;
    }
    public String getAnalysisTaskId() {
        return this.analysisTaskId;
    }

    public ContentPlanGenerationTask setConfigRevision(Long configRevision) {
        this.configRevision = configRevision;
        return this;
    }
    public Long getConfigRevision() {
        return this.configRevision;
    }

    public ContentPlanGenerationTask setDiagnosisTaskId(String diagnosisTaskId) {
        this.diagnosisTaskId = diagnosisTaskId;
        return this;
    }
    public String getDiagnosisTaskId() {
        return this.diagnosisTaskId;
    }

    public ContentPlanGenerationTask setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ContentPlanGenerationTask setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ContentPlanGenerationTask setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public ContentPlanGenerationTask setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public ContentPlanGenerationTask setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ContentPlanGenerationTask setReportConfigRevision(Long reportConfigRevision) {
        this.reportConfigRevision = reportConfigRevision;
        return this;
    }
    public Long getReportConfigRevision() {
        return this.reportConfigRevision;
    }

    public ContentPlanGenerationTask setStaleConfig(Boolean staleConfig) {
        this.staleConfig = staleConfig;
        return this;
    }
    public Boolean getStaleConfig() {
        return this.staleConfig;
    }

    public ContentPlanGenerationTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ContentPlanGenerationTask setSubmittedAt(Long submittedAt) {
        this.submittedAt = submittedAt;
        return this;
    }
    public Long getSubmittedAt() {
        return this.submittedAt;
    }

    public ContentPlanGenerationTask setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ContentPlanGenerationTask setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ContentPlanGenerationTask setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static class ContentPlanGenerationTaskAnalysisModules extends TeaModel {
        /**
         * <p>The module content.</p>
         * 
         * <strong>example:</strong>
         * <p>The current brand mention rate in the AI website builder category is lower than the industry average, and user perception is mostly focused on pricing</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The key questions.</p>
         */
        @NameInMap("KeyQuestions")
        public java.util.List<String> keyQuestions;

        /**
         * <p>The module title.</p>
         * 
         * <strong>example:</strong>
         * <p>Current status of brand awareness</p>
         */
        @NameInMap("Title")
        public String title;

        public static ContentPlanGenerationTaskAnalysisModules build(java.util.Map<String, ?> map) throws Exception {
            ContentPlanGenerationTaskAnalysisModules self = new ContentPlanGenerationTaskAnalysisModules();
            return TeaModel.build(map, self);
        }

        public ContentPlanGenerationTaskAnalysisModules setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ContentPlanGenerationTaskAnalysisModules setKeyQuestions(java.util.List<String> keyQuestions) {
            this.keyQuestions = keyQuestions;
            return this;
        }
        public java.util.List<String> getKeyQuestions() {
            return this.keyQuestions;
        }

        public ContentPlanGenerationTaskAnalysisModules setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ContentPlanGenerationTaskAnalysis extends TeaModel {
        /**
         * <p>The analysis modules.</p>
         */
        @NameInMap("Modules")
        public java.util.List<ContentPlanGenerationTaskAnalysisModules> modules;

        /**
         * <p>The reference article writing guidelines, which include only structure and perspective, excluding third-party facts.</p>
         */
        @NameInMap("ReferenceWritingNotes")
        public java.util.List<String> referenceWritingNotes;

        /**
         * <p>The analysis summary.</p>
         * 
         * <strong>example:</strong>
         * <p>Insufficient brand awareness is the current main shortcoming. It is recommended to prioritize adding content related to product capabilities</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static ContentPlanGenerationTaskAnalysis build(java.util.Map<String, ?> map) throws Exception {
            ContentPlanGenerationTaskAnalysis self = new ContentPlanGenerationTaskAnalysis();
            return TeaModel.build(map, self);
        }

        public ContentPlanGenerationTaskAnalysis setModules(java.util.List<ContentPlanGenerationTaskAnalysisModules> modules) {
            this.modules = modules;
            return this;
        }
        public java.util.List<ContentPlanGenerationTaskAnalysisModules> getModules() {
            return this.modules;
        }

        public ContentPlanGenerationTaskAnalysis setReferenceWritingNotes(java.util.List<String> referenceWritingNotes) {
            this.referenceWritingNotes = referenceWritingNotes;
            return this;
        }
        public java.util.List<String> getReferenceWritingNotes() {
            return this.referenceWritingNotes;
        }

        public ContentPlanGenerationTaskAnalysis setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

}
