// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class HotUpdateJobResult extends TeaModel {
    @NameInMap("hotUpdateParams")
    public HotUpdateJobParams hotUpdateParams;

    @NameInMap("jobHotUpdateId")
    public String jobHotUpdateId;

    @NameInMap("jobId")
    public String jobId;

    @NameInMap("status")
    public HotUpdateJobStatus status;

    @NameInMap("targetResourceSetting")
    public BriefResourceSetting targetResourceSetting;

    public static HotUpdateJobResult build(java.util.Map<String, ?> map) throws Exception {
        HotUpdateJobResult self = new HotUpdateJobResult();
        return TeaModel.build(map, self);
    }

    public HotUpdateJobResult setHotUpdateParams(HotUpdateJobParams hotUpdateParams) {
        this.hotUpdateParams = hotUpdateParams;
        return this;
    }
    public HotUpdateJobParams getHotUpdateParams() {
        return this.hotUpdateParams;
    }

    public HotUpdateJobResult setJobHotUpdateId(String jobHotUpdateId) {
        this.jobHotUpdateId = jobHotUpdateId;
        return this;
    }
    public String getJobHotUpdateId() {
        return this.jobHotUpdateId;
    }

    public HotUpdateJobResult setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public HotUpdateJobResult setStatus(HotUpdateJobStatus status) {
        this.status = status;
        return this;
    }
    public HotUpdateJobStatus getStatus() {
        return this.status;
    }

    public HotUpdateJobResult setTargetResourceSetting(BriefResourceSetting targetResourceSetting) {
        this.targetResourceSetting = targetResourceSetting;
        return this;
    }
    public BriefResourceSetting getTargetResourceSetting() {
        return this.targetResourceSetting;
    }

}
