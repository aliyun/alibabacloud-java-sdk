// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RevisionConfig extends TeaModel {
    /**
     * <p>The container configurations. You can deploy only one container for each application. The maximum length of this array is 1.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Containers")
    public java.util.List<Container> containers;

    /**
     * <p>Specifies whether to enable Application Real-Time Monitoring Service (ARMS) monitoring. Valid values:</p>
     * <ul>
     * <li><strong><code>true</code></strong>: Enables the ARMS monitoring.</li>
     * <li><strong><code>false</code></strong>: Disables the ARMS monitoring.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableArmsMetrics")
    public Boolean enableArmsMetrics;

    /**
     * <p>The network configurations.</p>
     * <blockquote>
     * <p> This parameter is used to configure network settings for a version of the application.</p>
     * </blockquote>
     */
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
