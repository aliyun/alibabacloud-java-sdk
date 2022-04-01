// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteKubeCustomerResourceRequest extends TeaModel {
    // deleteKubeCustomerResourcesParam
    @NameInMap("deleteKubeCustomerResourcesParam")
    public DeleteKubeCustomerResourcesParam deleteKubeCustomerResourcesParam;

    public static DeleteKubeCustomerResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKubeCustomerResourceRequest self = new DeleteKubeCustomerResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKubeCustomerResourceRequest setDeleteKubeCustomerResourcesParam(DeleteKubeCustomerResourcesParam deleteKubeCustomerResourcesParam) {
        this.deleteKubeCustomerResourcesParam = deleteKubeCustomerResourcesParam;
        return this;
    }
    public DeleteKubeCustomerResourcesParam getDeleteKubeCustomerResourcesParam() {
        return this.deleteKubeCustomerResourcesParam;
    }

}
