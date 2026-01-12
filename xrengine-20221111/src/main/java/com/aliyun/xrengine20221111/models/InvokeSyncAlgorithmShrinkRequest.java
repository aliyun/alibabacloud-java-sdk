// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class InvokeSyncAlgorithmShrinkRequest extends TeaModel {
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
    public String paramsShrink;

    public static InvokeSyncAlgorithmShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeSyncAlgorithmShrinkRequest self = new InvokeSyncAlgorithmShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InvokeSyncAlgorithmShrinkRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public InvokeSyncAlgorithmShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InvokeSyncAlgorithmShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
