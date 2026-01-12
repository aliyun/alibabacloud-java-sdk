// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class InvokeSyncAlgorithmRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Params")
    public java.util.Map<String, ?> params;

    public static InvokeSyncAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeSyncAlgorithmRequest self = new InvokeSyncAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public InvokeSyncAlgorithmRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public InvokeSyncAlgorithmRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InvokeSyncAlgorithmRequest setParams(java.util.Map<String, ?> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

}
