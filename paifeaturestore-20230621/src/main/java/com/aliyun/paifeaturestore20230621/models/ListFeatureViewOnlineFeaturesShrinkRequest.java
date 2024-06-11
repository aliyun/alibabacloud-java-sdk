// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewOnlineFeaturesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JoinIds")
    public String joinIdsShrink;

    public static ListFeatureViewOnlineFeaturesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewOnlineFeaturesShrinkRequest self = new ListFeatureViewOnlineFeaturesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewOnlineFeaturesShrinkRequest setJoinIdsShrink(String joinIdsShrink) {
        this.joinIdsShrink = joinIdsShrink;
        return this;
    }
    public String getJoinIdsShrink() {
        return this.joinIdsShrink;
    }

}
