// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateStoreViewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

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

    public static CreateStoreViewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStoreViewRequest self = new CreateStoreViewRequest();
        return TeaModel.build(map, self);
    }

    public CreateStoreViewRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateStoreViewRequest setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public CreateStoreViewRequest setStores(java.util.List<StoreViewStore> stores) {
        this.stores = stores;
        return this;
    }
    public java.util.List<StoreViewStore> getStores() {
        return this.stores;
    }

}
