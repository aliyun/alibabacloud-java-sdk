// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteAgingRequest extends TeaModel {
    // 要删除的时效id列表
    @NameInMap("AgingIds")
    public java.util.List<Long> agingIds;

    // sass实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 店铺id
    @NameInMap("ShopId")
    public String shopId;

    public static DeleteAgingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgingRequest self = new DeleteAgingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgingRequest setAgingIds(java.util.List<Long> agingIds) {
        this.agingIds = agingIds;
        return this;
    }
    public java.util.List<Long> getAgingIds() {
        return this.agingIds;
    }

    public DeleteAgingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteAgingRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
