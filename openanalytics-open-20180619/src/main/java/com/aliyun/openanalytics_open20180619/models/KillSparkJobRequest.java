// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class KillSparkJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>j202011031935hangzhouf742a4330003667</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCluster</p>
     */
    @NameInMap("VcName")
    public String vcName;

    public static KillSparkJobRequest build(java.util.Map<String, ?> map) throws Exception {
        KillSparkJobRequest self = new KillSparkJobRequest();
        return TeaModel.build(map, self);
    }

    public KillSparkJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public KillSparkJobRequest setVcName(String vcName) {
        this.vcName = vcName;
        return this;
    }
    public String getVcName() {
        return this.vcName;
    }

}
