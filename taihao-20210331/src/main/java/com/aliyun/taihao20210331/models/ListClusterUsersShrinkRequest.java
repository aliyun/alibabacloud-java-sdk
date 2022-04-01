// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterUsersShrinkRequest extends TeaModel {
    @NameInMap("listClusterUsersParam")
    public String listClusterUsersParamShrink;

    public static ListClusterUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterUsersShrinkRequest self = new ListClusterUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterUsersShrinkRequest setListClusterUsersParamShrink(String listClusterUsersParamShrink) {
        this.listClusterUsersParamShrink = listClusterUsersParamShrink;
        return this;
    }
    public String getListClusterUsersParamShrink() {
        return this.listClusterUsersParamShrink;
    }

}
