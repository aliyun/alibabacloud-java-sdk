// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebApplicationStatus extends TeaModel {
    /**
     * <p>The number of application instances.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("InstanceCount")
    public Long instanceCount;

    /**
     * <p>The scaling configurations of the application.</p>
     */
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
