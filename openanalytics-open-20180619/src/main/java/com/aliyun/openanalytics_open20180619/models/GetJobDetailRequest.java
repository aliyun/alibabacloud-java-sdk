// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetJobDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>j202010271622hangzhouf742a4330000923</p>
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

    public static GetJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobDetailRequest self = new GetJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetJobDetailRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobDetailRequest setVcName(String vcName) {
        this.vcName = vcName;
        return this;
    }
    public String getVcName() {
        return this.vcName;
    }

}
