// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewOnlineFeaturesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JoinIds")
    public java.util.List<String> joinIds;

    public static ListFeatureViewOnlineFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewOnlineFeaturesRequest self = new ListFeatureViewOnlineFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewOnlineFeaturesRequest setJoinIds(java.util.List<String> joinIds) {
        this.joinIds = joinIds;
        return this;
    }
    public java.util.List<String> getJoinIds() {
        return this.joinIds;
    }

}
