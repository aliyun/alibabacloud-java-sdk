// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListKubeCustomerResourceRequest extends TeaModel {
    // listKubeCustomerResourcesParam
    @NameInMap("listKubeCustomerResourcesParam")
    public ListKubeCustomerResourcesParam listKubeCustomerResourcesParam;

    public static ListKubeCustomerResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKubeCustomerResourceRequest self = new ListKubeCustomerResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListKubeCustomerResourceRequest setListKubeCustomerResourcesParam(ListKubeCustomerResourcesParam listKubeCustomerResourcesParam) {
        this.listKubeCustomerResourcesParam = listKubeCustomerResourcesParam;
        return this;
    }
    public ListKubeCustomerResourcesParam getListKubeCustomerResourcesParam() {
        return this.listKubeCustomerResourcesParam;
    }

}
