// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateStoreViewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("storeType")
    public String storeType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("stores")
    public java.util.List<StoreViewStore> stores;

    public static UpdateStoreViewRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoreViewRequest self = new UpdateStoreViewRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStoreViewRequest setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public UpdateStoreViewRequest setStores(java.util.List<StoreViewStore> stores) {
        this.stores = stores;
        return this;
    }
    public java.util.List<StoreViewStore> getStores() {
        return this.stores;
    }

}
