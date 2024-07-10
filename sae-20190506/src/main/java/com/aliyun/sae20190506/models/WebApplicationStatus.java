// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebApplicationStatus extends TeaModel {
    @NameInMap("InstanceCount")
    public Long instanceCount;

    @NameInMap("WebScalingConfig")
    public WebScalingConfig webScalingConfig;

    public static WebApplicationStatus build(java.util.Map<String, ?> map) throws Exception {
        WebApplicationStatus self = new WebApplicationStatus();
        return TeaModel.build(map, self);
    }

    public WebApplicationStatus setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    public WebApplicationStatus setWebScalingConfig(WebScalingConfig webScalingConfig) {
        this.webScalingConfig = webScalingConfig;
        return this;
    }
    public WebScalingConfig getWebScalingConfig() {
        return this.webScalingConfig;
    }

}
