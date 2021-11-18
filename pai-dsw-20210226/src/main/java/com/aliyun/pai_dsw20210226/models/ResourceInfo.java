// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ResourceInfo extends TeaModel {
    // 显卡类型
    @NameInMap("Name")
    public String name;

    // 支付类型
    @NameInMap("PayType")
    public Long payType;

    // 资源类型
    @NameInMap("ResourceType")
    public Long resourceType;

    public static ResourceInfo build(java.util.Map<String, ?> map) throws Exception {
        ResourceInfo self = new ResourceInfo();
        return TeaModel.build(map, self);
    }

    public ResourceInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResourceInfo setPayType(Long payType) {
        this.payType = payType;
        return this;
    }
    public Long getPayType() {
        return this.payType;
    }

    public ResourceInfo setResourceType(Long resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Long getResourceType() {
        return this.resourceType;
    }

}
