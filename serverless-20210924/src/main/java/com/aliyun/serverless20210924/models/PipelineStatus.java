// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class PipelineStatus extends TeaModel {
    @NameInMap("phase")
    public String phase;

    public static PipelineStatus build(java.util.Map<String, ?> map) throws Exception {
        PipelineStatus self = new PipelineStatus();
        return TeaModel.build(map, self);
    }

    public PipelineStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

}
