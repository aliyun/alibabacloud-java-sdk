// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoExperimentsResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_INPUT_PARAMS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Extra error information.</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, String> detail;

    /**
     * <p>experiment array.</p>
     */
    @NameInMap("Experiments")
    public java.util.List<ListHpoExperimentsResponseBodyExperiments> experiments;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Missing \&quot;user_id\&quot; in request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3F190916-B3E5-5D1E-AD0C-35C0DF105F51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total qualified experiment count.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHpoExperimentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHpoExperimentsResponseBody self = new ListHpoExperimentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHpoExperimentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHpoExperimentsResponseBody setDetail(java.util.Map<String, String> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, String> getDetail() {
        return this.detail;
    }

    public ListHpoExperimentsResponseBody setExperiments(java.util.List<ListHpoExperimentsResponseBodyExperiments> experiments) {
        this.experiments = experiments;
        return this;
    }
    public java.util.List<ListHpoExperimentsResponseBodyExperiments> getExperiments() {
        return this.experiments;
    }

    public ListHpoExperimentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHpoExperimentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHpoExperimentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHpoExperimentsResponseBodyExperiments extends TeaModel {
        /**
         * <p>Experiment accessibility, private or public.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("Accessibility")
        public String accessibility;

        /**
         * <p>Experiment job run environment configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>[odps_config]
         * key1 = value1
         * key2 = value2</p>
         */
        @NameInMap("ConfigIni")
        public String configIni;

        /**
         * <p>HPO experiment run configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>experimentName: dlc_oss_mnist
         * experimentWorkingDirectory: ../expdir
         * searchSpaceFile: search_space.json
         * trialCommand: python3 -m hpo_tools.core.utils.run --config=./trial.ini
         * trialConcurrency: 1
         * maxTrialNumber: 4
         * tuner:
         *   name: TPE
         *   classArgs:
         *     optimize_mode: maximize
         * trainingService:
         *   platform: local
         * assessor:
         *   name: PAIAssessor
         *   classArgs:
         *     optimize_mode: maximize
         *     start_step: 2</p>
         */
        @NameInMap("ConfigYml")
        public String configYml;

        /**
         * <p>The one who created the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>1049310008714189</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>If the experiment is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        /**
         * <p>The description of the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Experiment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sORVEck</p>
         */
        @NameInMap("ExperimentId")
        public String experimentId;

        /**
         * <p>Experiment Create Time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-31T10:29:30Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Last modified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-27T00:55:54Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>Experimetn job type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>Experiment name</p>
         * 
         * <strong>example:</strong>
         * <p>my experiment x</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Experiment hyperparameter search space.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;foo\&quot;:\&quot;bar\&quot;}</p>
         */
        @NameInMap("SearchSpace")
        public String searchSpace;

        /**
         * <p>Experiment status.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATED, RUNNING, FINISHED, FAILED, EARLY_STOPPED, USER_CANCELED, SYS_CANCELED, WAITING, NO_MORE_TRIAL, UNKNOWN</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>How many trials the experiment have.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TrialCount")
        public Integer trialCount;

        /**
         * <p>Trial status map.</p>
         */
        @NameInMap("TrialStatus")
        public java.util.Map<String, String> trialStatus;

        /**
         * <p>The ID of the AI workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListHpoExperimentsResponseBodyExperiments build(java.util.Map<String, ?> map) throws Exception {
            ListHpoExperimentsResponseBodyExperiments self = new ListHpoExperimentsResponseBodyExperiments();
            return TeaModel.build(map, self);
        }

        public ListHpoExperimentsResponseBodyExperiments setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public ListHpoExperimentsResponseBodyExperiments setConfigIni(String configIni) {
            this.configIni = configIni;
            return this;
        }
        public String getConfigIni() {
            return this.configIni;
        }

        public ListHpoExperimentsResponseBodyExperiments setConfigYml(String configYml) {
            this.configYml = configYml;
            return this;
        }
        public String getConfigYml() {
            return this.configYml;
        }

        public ListHpoExperimentsResponseBodyExperiments setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListHpoExperimentsResponseBodyExperiments setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListHpoExperimentsResponseBodyExperiments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHpoExperimentsResponseBodyExperiments setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListHpoExperimentsResponseBodyExperiments setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListHpoExperimentsResponseBodyExperiments setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListHpoExperimentsResponseBodyExperiments setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListHpoExperimentsResponseBodyExperiments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHpoExperimentsResponseBodyExperiments setSearchSpace(String searchSpace) {
            this.searchSpace = searchSpace;
            return this;
        }
        public String getSearchSpace() {
            return this.searchSpace;
        }

        public ListHpoExperimentsResponseBodyExperiments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHpoExperimentsResponseBodyExperiments setTrialCount(Integer trialCount) {
            this.trialCount = trialCount;
            return this;
        }
        public Integer getTrialCount() {
            return this.trialCount;
        }

        public ListHpoExperimentsResponseBodyExperiments setTrialStatus(java.util.Map<String, String> trialStatus) {
            this.trialStatus = trialStatus;
            return this;
        }
        public java.util.Map<String, String> getTrialStatus() {
            return this.trialStatus;
        }

        public ListHpoExperimentsResponseBodyExperiments setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
