// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterNodeGroupShrinkRequest extends TeaModel {
    // listClusterNodeGroupsParam
    @NameInMap("listClusterNodeGroupsParam")
    public String listClusterNodeGroupsParamShrink;

    public static ListClusterNodeGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodeGroupShrinkRequest self = new ListClusterNodeGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterNodeGroupShrinkRequest setListClusterNodeGroupsParamShrink(String listClusterNodeGroupsParamShrink) {
        this.listClusterNodeGroupsParamShrink = listClusterNodeGroupsParamShrink;
        return this;
    }
    public String getListClusterNodeGroupsParamShrink() {
        return this.listClusterNodeGroupsParamShrink;
    }

}
