// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewOnlineFeaturesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;dlrm_hstu&quot;: true}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The join IDs used to retrieve online features.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JoinIds")
    public java.util.List<String> joinIds;

    public static ListFeatureViewOnlineFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewOnlineFeaturesRequest self = new ListFeatureViewOnlineFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewOnlineFeaturesRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ListFeatureViewOnlineFeaturesRequest setJoinIds(java.util.List<String> joinIds) {
        this.joinIds = joinIds;
        return this;
    }
    public java.util.List<String> getJoinIds() {
        return this.joinIds;
    }

}
