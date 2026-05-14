// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewOnlineFeaturesShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;dlrm_hstu&quot;: true}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JoinIds")
    public String joinIdsShrink;

    public static ListFeatureViewOnlineFeaturesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewOnlineFeaturesShrinkRequest self = new ListFeatureViewOnlineFeaturesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewOnlineFeaturesShrinkRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ListFeatureViewOnlineFeaturesShrinkRequest setJoinIdsShrink(String joinIdsShrink) {
        this.joinIdsShrink = joinIdsShrink;
        return this;
    }
    public String getJoinIdsShrink() {
        return this.joinIdsShrink;
    }

}
