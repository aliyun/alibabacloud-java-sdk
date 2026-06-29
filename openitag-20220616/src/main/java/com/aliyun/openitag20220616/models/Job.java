// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class Job extends TeaModel {
    /**
     * <p>Job creator.</p>
     */
    @NameInMap("Creator")
    public SimpleUser creator;

    /**
     * <p>Creation Time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-28 11:42:19</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Updated At.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-28 11:42:20</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>147***441221943296</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Task Result.</p>
     */
    @NameInMap("JobResult")
    public JobJobResult jobResult;

    /**
     * <p>Task Type. Currently, only DOWNLOWD_MARKRESULT_FLOW is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>DOWNLOWD_MARKRESULT_FLOW</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>Job status. Possible values:</p>
     * <ul>
     * <li>init: initialization</li>
     * <li>running: running</li>
     * <li>pause: pause</li>
     * <li>stop: stopped</li>
     * <li>succ: Succeeded</li>
     * <li>fail: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>succ</p>
     */
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
        /**
         * <p>Return value link, which is the OSS path where the annotation results are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://****-hz-oss.oss-cn-hangzhou.aliyuncs.com/output/ocr_demo001.manifest</p>
         */
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
