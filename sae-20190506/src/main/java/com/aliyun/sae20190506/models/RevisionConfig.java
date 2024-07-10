// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RevisionConfig extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Containers")
    public java.util.List<Container> containers;

    @NameInMap("EnableArmsMetrics")
    public Boolean enableArmsMetrics;

    @NameInMap("WebNetworkConfig")
    public WebNetworkConfig webNetworkConfig;

    public static RevisionConfig build(java.util.Map<String, ?> map) throws Exception {
        RevisionConfig self = new RevisionConfig();
        return TeaModel.build(map, self);
    }

    public RevisionConfig setContainers(java.util.List<Container> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<Container> getContainers() {
        return this.containers;
    }

    public RevisionConfig setEnableArmsMetrics(Boolean enableArmsMetrics) {
        this.enableArmsMetrics = enableArmsMetrics;
        return this;
    }
    public Boolean getEnableArmsMetrics() {
        return this.enableArmsMetrics;
    }

    public RevisionConfig setWebNetworkConfig(WebNetworkConfig webNetworkConfig) {
        this.webNetworkConfig = webNetworkConfig;
        return this;
    }
    public WebNetworkConfig getWebNetworkConfig() {
        return this.webNetworkConfig;
    }

}
