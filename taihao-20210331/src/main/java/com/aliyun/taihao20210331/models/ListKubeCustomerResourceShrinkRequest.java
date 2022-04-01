// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListKubeCustomerResourceShrinkRequest extends TeaModel {
    // listKubeCustomerResourcesParam
    @NameInMap("listKubeCustomerResourcesParam")
    public String listKubeCustomerResourcesParamShrink;

    public static ListKubeCustomerResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKubeCustomerResourceShrinkRequest self = new ListKubeCustomerResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListKubeCustomerResourceShrinkRequest setListKubeCustomerResourcesParamShrink(String listKubeCustomerResourcesParamShrink) {
        this.listKubeCustomerResourcesParamShrink = listKubeCustomerResourcesParamShrink;
        return this;
    }
    public String getListKubeCustomerResourcesParamShrink() {
        return this.listKubeCustomerResourcesParamShrink;
    }

}
