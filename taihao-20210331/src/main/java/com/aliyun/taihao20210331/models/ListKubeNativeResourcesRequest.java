// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListKubeNativeResourcesRequest extends TeaModel {
    // listKubeNativeResourcesParam
    @NameInMap("listKubeNativeResourcesParam")
    public ListKubeNativeResourcesParam listKubeNativeResourcesParam;

    public static ListKubeNativeResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKubeNativeResourcesRequest self = new ListKubeNativeResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListKubeNativeResourcesRequest setListKubeNativeResourcesParam(ListKubeNativeResourcesParam listKubeNativeResourcesParam) {
        this.listKubeNativeResourcesParam = listKubeNativeResourcesParam;
        return this;
    }
    public ListKubeNativeResourcesParam getListKubeNativeResourcesParam() {
        return this.listKubeNativeResourcesParam;
    }

}
