// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetSparkSessionStateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>j202104171040zjkb4cc449d0000000</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetSparkSessionStateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkSessionStateRequest self = new GetSparkSessionStateRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkSessionStateRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
