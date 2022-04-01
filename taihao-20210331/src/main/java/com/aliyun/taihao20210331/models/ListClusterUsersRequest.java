// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterUsersRequest extends TeaModel {
    @NameInMap("listClusterUsersParam")
    public ListClusterUserParam listClusterUsersParam;

    public static ListClusterUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterUsersRequest self = new ListClusterUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterUsersRequest setListClusterUsersParam(ListClusterUserParam listClusterUsersParam) {
        this.listClusterUsersParam = listClusterUsersParam;
        return this;
    }
    public ListClusterUserParam getListClusterUsersParam() {
        return this.listClusterUsersParam;
    }

}
