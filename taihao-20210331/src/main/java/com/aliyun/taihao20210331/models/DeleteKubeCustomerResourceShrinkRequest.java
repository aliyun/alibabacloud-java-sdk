// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteKubeCustomerResourceShrinkRequest extends TeaModel {
    // deleteKubeCustomerResourcesParam
    @NameInMap("deleteKubeCustomerResourcesParam")
    public String deleteKubeCustomerResourcesParamShrink;

    public static DeleteKubeCustomerResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKubeCustomerResourceShrinkRequest self = new DeleteKubeCustomerResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKubeCustomerResourceShrinkRequest setDeleteKubeCustomerResourcesParamShrink(String deleteKubeCustomerResourcesParamShrink) {
        this.deleteKubeCustomerResourcesParamShrink = deleteKubeCustomerResourcesParamShrink;
        return this;
    }
    public String getDeleteKubeCustomerResourcesParamShrink() {
        return this.deleteKubeCustomerResourcesParamShrink;
    }

}
