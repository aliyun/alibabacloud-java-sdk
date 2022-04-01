// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterScriptsRequest extends TeaModel {
    // listClusterScriptsParam
    @NameInMap("listClusterScriptsParam")
    public ListClusterScriptsParam listClusterScriptsParam;

    public static ListClusterScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterScriptsRequest self = new ListClusterScriptsRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterScriptsRequest setListClusterScriptsParam(ListClusterScriptsParam listClusterScriptsParam) {
        this.listClusterScriptsParam = listClusterScriptsParam;
        return this;
    }
    public ListClusterScriptsParam getListClusterScriptsParam() {
        return this.listClusterScriptsParam;
    }

}
