// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterNodeGroupRequest extends TeaModel {
    // listClusterNodeGroupsParam
    @NameInMap("listClusterNodeGroupsParam")
    public ListClusterNodeGroupsParam listClusterNodeGroupsParam;

    public static ListClusterNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodeGroupRequest self = new ListClusterNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterNodeGroupRequest setListClusterNodeGroupsParam(ListClusterNodeGroupsParam listClusterNodeGroupsParam) {
        this.listClusterNodeGroupsParam = listClusterNodeGroupsParam;
        return this;
    }
    public ListClusterNodeGroupsParam getListClusterNodeGroupsParam() {
        return this.listClusterNodeGroupsParam;
    }

}
