// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterPluginInfoRequest extends TeaModel {
    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PluginName")
    public String pluginName;

    public static ListClusterPluginInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterPluginInfoRequest self = new ListClusterPluginInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterPluginInfoRequest setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    public ListClusterPluginInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListClusterPluginInfoRequest setPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }
    public String getPluginName() {
        return this.pluginName;
    }

}
