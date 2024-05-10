// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetStoreViewResponseBody extends TeaModel {
    @NameInMap("storeType")
    public String storeType;

    @NameInMap("stores")
    public java.util.List<StoreViewStore> stores;

    public static GetStoreViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStoreViewResponseBody self = new GetStoreViewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStoreViewResponseBody setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public GetStoreViewResponseBody setStores(java.util.List<StoreViewStore> stores) {
        this.stores = stores;
        return this;
    }
    public java.util.List<StoreViewStore> getStores() {
        return this.stores;
    }

}
