// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class SpotStockItem extends TeaModel {
    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ml.gp7vf.16.40xlarge</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The inventory details.</p>
     */
    @NameInMap("internalInfo")
    public java.util.List<SpotStockInternalInfo> internalInfo;

    /**
     * <p>The inventory status.</p>
     * 
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("stockStatus")
    public String stockStatus;

    public static SpotStockItem build(java.util.Map<String, ?> map) throws Exception {
        SpotStockItem self = new SpotStockItem();
        return TeaModel.build(map, self);
    }

    public SpotStockItem setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public SpotStockItem setInternalInfo(java.util.List<SpotStockInternalInfo> internalInfo) {
        this.internalInfo = internalInfo;
        return this;
    }
    public java.util.List<SpotStockInternalInfo> getInternalInfo() {
        return this.internalInfo;
    }

    public SpotStockItem setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
        return this;
    }
    public String getStockStatus() {
        return this.stockStatus;
    }

}
