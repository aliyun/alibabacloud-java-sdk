// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteKubeNativeResourcesRequest extends TeaModel {
    // deleteKubeNativeResourcesParam
    @NameInMap("deleteKubeNativeResourcesParam")
    public DeleteKubeNativeResourcesParam deleteKubeNativeResourcesParam;

    public static DeleteKubeNativeResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKubeNativeResourcesRequest self = new DeleteKubeNativeResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKubeNativeResourcesRequest setDeleteKubeNativeResourcesParam(DeleteKubeNativeResourcesParam deleteKubeNativeResourcesParam) {
        this.deleteKubeNativeResourcesParam = deleteKubeNativeResourcesParam;
        return this;
    }
    public DeleteKubeNativeResourcesParam getDeleteKubeNativeResourcesParam() {
        return this.deleteKubeNativeResourcesParam;
    }

}
