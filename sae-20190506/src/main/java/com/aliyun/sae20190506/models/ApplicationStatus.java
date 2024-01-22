// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ApplicationStatus extends TeaModel {
    @NameInMap("instanceCount")
    public Long instanceCount;

    @NameInMap("scaleConfig")
    public ScaleConfig scaleConfig;

    public static ApplicationStatus build(java.util.Map<String, ?> map) throws Exception {
        ApplicationStatus self = new ApplicationStatus();
        return TeaModel.build(map, self);
    }

    public ApplicationStatus setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    public ApplicationStatus setScaleConfig(ScaleConfig scaleConfig) {
        this.scaleConfig = scaleConfig;
        return this;
    }
    public ScaleConfig getScaleConfig() {
        return this.scaleConfig;
    }

}
