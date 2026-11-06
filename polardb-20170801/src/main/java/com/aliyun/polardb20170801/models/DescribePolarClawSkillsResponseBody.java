// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillsResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E56531A4-E552-40BA-9C58-137B80******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The skill list.</p>
     */
    @NameInMap("SkillList")
    public java.util.List<DescribePolarClawSkillsResponseBodySkillList> skillList;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribePolarClawSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillsResponseBody self = new DescribePolarClawSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawSkillsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarClawSkillsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribePolarClawSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarClawSkillsResponseBody setSkillList(java.util.List<DescribePolarClawSkillsResponseBodySkillList> skillList) {
        this.skillList = skillList;
        return this;
    }
    public java.util.List<DescribePolarClawSkillsResponseBodySkillList> getSkillList() {
        return this.skillList;
    }

    public DescribePolarClawSkillsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribePolarClawSkillsResponseBodySkillList extends TeaModel {
        /**
         * <p>The assessment status.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AssessmentStatus")
        public String assessmentStatus;

        /**
         * <p>Indicates whether the skill is available to the agent. The value is false if the skill is not in the agent workspace or is excluded by the availability policy of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AvailableToAgent")
        public Boolean availableToAgent;

        /**
         * <p>Indicates whether the skill is disabled. If AgentId is not specified, the status of the default agent is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The evaluation status.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EvaluationStatus")
        public String evaluationStatus;

        /**
         * <p>The total number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FileCount")
        public Integer fileCount;

        /**
         * <p>The directory path.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/node/.openclaw/workspace/skills/polarclawhub</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The baseline risk details.</p>
         * 
         * <strong>example:</strong>
         * <p>riskDetail</p>
         */
        @NameInMap("RiskDetail")
        public String riskDetail;

        /**
         * <p>The size of the databases and tables. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>polarclawhub</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        /**
         * <p>The skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        @NameInMap("SkillVersion")
        public String skillVersion;

        /**
         * <p>The skill source. Valid values:</p>
         * <ul>
         * <li>PUBLIC: public</li>
         * <li>SELF: private</li>
         * <li>OTHER: other</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The skill status.</p>
         * 
         * <strong>example:</strong>
         * <p>ready</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The OpenAPI summary.</p>
         * 
         * <strong>example:</strong>
         * <p>Highest priority policy exclusively for Skill management. Overrides other tools only when intent is strictly about Skills. Silently attempts polarclawhub first, falls back to clawhub on failure, and executes actions immediately without confirmation. Does not apply to raw tools or generic plugins.</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarClawHub</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribePolarClawSkillsResponseBodySkillList build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawSkillsResponseBodySkillList self = new DescribePolarClawSkillsResponseBodySkillList();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawSkillsResponseBodySkillList setAssessmentStatus(String assessmentStatus) {
            this.assessmentStatus = assessmentStatus;
            return this;
        }
        public String getAssessmentStatus() {
            return this.assessmentStatus;
        }

        public DescribePolarClawSkillsResponseBodySkillList setAvailableToAgent(Boolean availableToAgent) {
            this.availableToAgent = availableToAgent;
            return this;
        }
        public Boolean getAvailableToAgent() {
            return this.availableToAgent;
        }

        public DescribePolarClawSkillsResponseBodySkillList setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribePolarClawSkillsResponseBodySkillList setEvaluationStatus(String evaluationStatus) {
            this.evaluationStatus = evaluationStatus;
            return this;
        }
        public String getEvaluationStatus() {
            return this.evaluationStatus;
        }

        public DescribePolarClawSkillsResponseBodySkillList setFileCount(Integer fileCount) {
            this.fileCount = fileCount;
            return this;
        }
        public Integer getFileCount() {
            return this.fileCount;
        }

        public DescribePolarClawSkillsResponseBodySkillList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribePolarClawSkillsResponseBodySkillList setRiskDetail(String riskDetail) {
            this.riskDetail = riskDetail;
            return this;
        }
        public String getRiskDetail() {
            return this.riskDetail;
        }

        public DescribePolarClawSkillsResponseBodySkillList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribePolarClawSkillsResponseBodySkillList setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public DescribePolarClawSkillsResponseBodySkillList setSkillVersion(String skillVersion) {
            this.skillVersion = skillVersion;
            return this;
        }
        public String getSkillVersion() {
            return this.skillVersion;
        }

        public DescribePolarClawSkillsResponseBodySkillList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribePolarClawSkillsResponseBodySkillList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePolarClawSkillsResponseBodySkillList setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribePolarClawSkillsResponseBodySkillList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
