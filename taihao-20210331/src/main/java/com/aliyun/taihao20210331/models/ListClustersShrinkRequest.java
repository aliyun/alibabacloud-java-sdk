// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClustersShrinkRequest extends TeaModel {
    // listClustersParam
    @NameInMap("listClustersParam")
    public String listClustersParamShrink;

    public static ListClustersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClustersShrinkRequest self = new ListClustersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClustersShrinkRequest setListClustersParamShrink(String listClustersParamShrink) {
        this.listClustersParamShrink = listClustersParamShrink;
        return this;
    }
    public String getListClustersParamShrink() {
        return this.listClustersParamShrink;
    }

}
