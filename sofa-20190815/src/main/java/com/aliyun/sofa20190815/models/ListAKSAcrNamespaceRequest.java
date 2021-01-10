// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSAcrNamespaceRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    public static ListAKSAcrNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAKSAcrNamespaceRequest self = new ListAKSAcrNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public ListAKSAcrNamespaceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
