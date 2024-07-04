// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class FreeResourceDetail extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static FreeResourceDetail build(java.util.Map<String, ?> map) throws Exception {
        FreeResourceDetail self = new FreeResourceDetail();
        return TeaModel.build(map, self);
    }

    public FreeResourceDetail setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public FreeResourceDetail setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
