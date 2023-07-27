// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketInventoryRequest extends TeaModel {
    /**
     * <p>存储清单配置信息的容器。</p>
     */
    @NameInMap("InventoryConfiguration")
    public InventoryConfiguration inventoryConfiguration;

    @NameInMap("inventoryId")
    public String inventoryId;

    public static PutBucketInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketInventoryRequest self = new PutBucketInventoryRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketInventoryRequest setInventoryConfiguration(InventoryConfiguration inventoryConfiguration) {
        this.inventoryConfiguration = inventoryConfiguration;
        return this;
    }
    public InventoryConfiguration getInventoryConfiguration() {
        return this.inventoryConfiguration;
    }

    public PutBucketInventoryRequest setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }
    public String getInventoryId() {
        return this.inventoryId;
    }

}
