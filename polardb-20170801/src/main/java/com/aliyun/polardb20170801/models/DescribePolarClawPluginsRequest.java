// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawPluginsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("PluginList")
    public java.util.List<String> pluginList;

    public static DescribePolarClawPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawPluginsRequest self = new DescribePolarClawPluginsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawPluginsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawPluginsRequest setPluginList(java.util.List<String> pluginList) {
        this.pluginList = pluginList;
        return this;
    }
    public java.util.List<String> getPluginList() {
        return this.pluginList;
    }

}
