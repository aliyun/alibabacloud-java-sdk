// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class Job extends TeaModel {
    @NameInMap("Creator")
    public SimpleUser creator;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobResult")
    public JobJobResult jobResult;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("Status")
    public String status;

    public static Job build(java.util.Map<String, ?> map) throws Exception {
        Job self = new Job();
        return TeaModel.build(map, self);
    }

    public Job setCreator(SimpleUser creator) {
        this.creator = creator;
        return this;
    }
    public SimpleUser getCreator() {
        return this.creator;
    }

    public Job setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Job setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Job setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public Job setJobResult(JobJobResult jobResult) {
        this.jobResult = jobResult;
        return this;
    }
    public JobJobResult getJobResult() {
        return this.jobResult;
    }

    public Job setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public Job setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class JobJobResult extends TeaModel {
        @NameInMap("ResultLink")
        public String resultLink;

        public static JobJobResult build(java.util.Map<String, ?> map) throws Exception {
            JobJobResult self = new JobJobResult();
            return TeaModel.build(map, self);
        }

        public JobJobResult setResultLink(String resultLink) {
            this.resultLink = resultLink;
            return this;
        }
        public String getResultLink() {
            return this.resultLink;
        }

    }

}
