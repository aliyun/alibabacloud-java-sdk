// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ContentPlan extends TeaModel {
    /**
     * <p>The additional user comments.</p>
     * 
     * <strong>example:</strong>
     * <p>Highlight the differentiated capabilities of the product and avoid exaggerated claims</p>
     */
    @NameInMap("AdditionalRequirements")
    public String additionalRequirements;

    /**
     * <p>The ID of the analysis task used for scheduling.</p>
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
     * <p>The completion time of the GEO diagnosis, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800000</p>
     */
    @NameInMap("DiagnosisCompletedAt")
    public Long diagnosisCompletedAt;

    /**
     * <p>The ID of the GEO diagnostic node.</p>
     * 
     * <strong>example:</strong>
     * <p>1f2e3d4c-5b6a-4798-8a9b-c0d1e2f3a4b5</p>
     */
    @NameInMap("DiagnosisTaskId")
    public String diagnosisTaskId;

    /**
     * <p>The type of the GEO diagnosis.</p>
     * 
     * <strong>example:</strong>
     * <p>GEO_BRAND</p>
     */
    @NameInMap("DiagnosisType")
    public String diagnosisType;

    /**
     * <p>The end date of the plan in the yyyy-MM-dd format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-18</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The ID of the generation task.</p>
     * 
     * <strong>example:</strong>
     * <p>cpt_9b7d4a5f8c0e1d2b3a4c5d6e3f7a1c2e</p>
     */
    @NameInMap("GenerationTaskId")
    public String generationTaskId;

    /**
     * <p>The ID of the content plan.</p>
     * 
     * <strong>example:</strong>
     * <p>plan_3f7a1c2e9b7d4a5f8c0e1d2b3a4c5d6e</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The ID of the workspace, which is the GEO workspace for brand marketing and corresponds to the appWorkspaceId.</p>
     * 
     * <strong>example:</strong>
     * <p>d4e5f60718293a4b5c6d7e8f90a1b2c3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The number of scheduled articles, which equals the number of matched generation days.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PublishFrequency")
    public Integer publishFrequency;

    /**
     * <p>The workspace configuration version used for the diagnostic report, which is strictly read during article generation.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("ReportConfigRevision")
    public Long reportConfigRevision;

    /**
     * <p>The start date of the plan in the yyyy-MM-dd format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-12</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The status of the plan. Valid values: ACTIVE, SUPERSEDED, COMPLETED, and FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The summary of the overall strategy for the plan.</p>
     * 
     * <strong>example:</strong>
     * <p>This week focuses on two themes: brand awareness and product capabilities, with a total of three articles</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
     * <p>The ID of the new plan that supersedes the current plan.</p>
     * 
     * <strong>example:</strong>
     * <p>plan_7a1c2e9b7d4a5f8c0e1d2b3a4c5d6e3f</p>
     */
    @NameInMap("SupersededBy")
    public String supersededBy;

    /**
     * <p>The IANA time zone used for scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    /**
     * <p>The weekly generation days, where ISO weekday 1 represents Monday and 7 represents Sunday.</p>
     */
    @NameInMap("Weekdays")
    public java.util.List<Integer> weekdays;

    public static ContentPlan build(java.util.Map<String, ?> map) throws Exception {
        ContentPlan self = new ContentPlan();
        return TeaModel.build(map, self);
    }

    public ContentPlan setAdditionalRequirements(String additionalRequirements) {
        this.additionalRequirements = additionalRequirements;
        return this;
    }
    public String getAdditionalRequirements() {
        return this.additionalRequirements;
    }

    public ContentPlan setAnalysisTaskId(String analysisTaskId) {
        this.analysisTaskId = analysisTaskId;
        return this;
    }
    public String getAnalysisTaskId() {
        return this.analysisTaskId;
    }

    public ContentPlan setConfigRevision(Long configRevision) {
        this.configRevision = configRevision;
        return this;
    }
    public Long getConfigRevision() {
        return this.configRevision;
    }

    public ContentPlan setDiagnosisCompletedAt(Long diagnosisCompletedAt) {
        this.diagnosisCompletedAt = diagnosisCompletedAt;
        return this;
    }
    public Long getDiagnosisCompletedAt() {
        return this.diagnosisCompletedAt;
    }

    public ContentPlan setDiagnosisTaskId(String diagnosisTaskId) {
        this.diagnosisTaskId = diagnosisTaskId;
        return this;
    }
    public String getDiagnosisTaskId() {
        return this.diagnosisTaskId;
    }

    public ContentPlan setDiagnosisType(String diagnosisType) {
        this.diagnosisType = diagnosisType;
        return this;
    }
    public String getDiagnosisType() {
        return this.diagnosisType;
    }

    public ContentPlan setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ContentPlan setGenerationTaskId(String generationTaskId) {
        this.generationTaskId = generationTaskId;
        return this;
    }
    public String getGenerationTaskId() {
        return this.generationTaskId;
    }

    public ContentPlan setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public ContentPlan setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ContentPlan setPublishFrequency(Integer publishFrequency) {
        this.publishFrequency = publishFrequency;
        return this;
    }
    public Integer getPublishFrequency() {
        return this.publishFrequency;
    }

    public ContentPlan setReportConfigRevision(Long reportConfigRevision) {
        this.reportConfigRevision = reportConfigRevision;
        return this;
    }
    public Long getReportConfigRevision() {
        return this.reportConfigRevision;
    }

    public ContentPlan setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ContentPlan setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ContentPlan setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public ContentPlan setSupersededBy(String supersededBy) {
        this.supersededBy = supersededBy;
        return this;
    }
    public String getSupersededBy() {
        return this.supersededBy;
    }

    public ContentPlan setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public ContentPlan setWeekdays(java.util.List<Integer> weekdays) {
        this.weekdays = weekdays;
        return this;
    }
    public java.util.List<Integer> getWeekdays() {
        return this.weekdays;
    }

}
