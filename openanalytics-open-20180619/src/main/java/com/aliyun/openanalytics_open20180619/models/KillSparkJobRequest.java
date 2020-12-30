// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class KillSparkJobRequest extends TeaModel {
    @NameInMap("VcName")
    public String vcName;

    @NameInMap("JobId")
    public String jobId;

    public static KillSparkJobRequest build(java.util.Map<String, ?> map) throws Exception {
        KillSparkJobRequest self = new KillSparkJobRequest();
        return TeaModel.build(map, self);
    }

    public KillSparkJobRequest setVcName(String vcName) {
        this.vcName = vcName;
        return this;
    }
    public String getVcName() {
        return this.vcName;
    }

    public KillSparkJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
