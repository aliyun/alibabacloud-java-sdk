// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateStoreViewRequest extends TeaModel {
    /**
     * <p>The name of the dataset.</p>
     * <ul>
     * <li><p>The name can contain only lowercase letters, digits, and underscores (_).</p>
     * </li>
     * <li><p>The name must start with a lowercase letter.</p>
     * </li>
     * <li><p>The name must be 3 to 62 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_storeview</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The type of the dataset. Set this parameter to metricstore to create a Metricstore dataset. Set this parameter to logstore to create a Logstore dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logstore</p>
     */
    @NameInMap("storeType")
    public String storeType;

    /**
     * <p>A list of Logstores or Metricstores.</p>
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
