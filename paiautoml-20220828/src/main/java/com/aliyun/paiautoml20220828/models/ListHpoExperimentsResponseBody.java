// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoExperimentsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Detail")
    public java.util.Map<String, String> detail;

    @NameInMap("Experiments")
    public java.util.List<ListHpoExperimentsResponseBodyExperiments> experiments;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Accessibility")
        public String accessibility;

        @NameInMap("ConfigIni")
        public String configIni;

        @NameInMap("ConfigYml")
        public String configYml;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("Name")
        public String name;

        @NameInMap("SearchSpace")
        public String searchSpace;

        @NameInMap("Status")
        public String status;

        @NameInMap("TrialCount")
        public Integer trialCount;

        @NameInMap("TrialStatus")
        public java.util.Map<String, String> trialStatus;

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
