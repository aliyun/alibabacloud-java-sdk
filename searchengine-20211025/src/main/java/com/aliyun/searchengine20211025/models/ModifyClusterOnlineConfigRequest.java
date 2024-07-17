// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterOnlineConfigRequest extends TeaModel {
    /**
     * <p>The cluster information.</p>
     */
    @NameInMap("clusters")
    public java.util.List<String> clusters;

    /**
     * <p>The configuration information.</p>
     */
    @NameInMap("config")
    public java.util.Map<String, Integer> config;

    public static ModifyClusterOnlineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterOnlineConfigRequest self = new ModifyClusterOnlineConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterOnlineConfigRequest setClusters(java.util.List<String> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<String> getClusters() {
        return this.clusters;
    }

    public ModifyClusterOnlineConfigRequest setConfig(java.util.Map<String, Integer> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, Integer> getConfig() {
        return this.config;
    }

}
