// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeComponentPropetiesRequest extends TeaModel {
    /**
     * <p>The commodity code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>learn_EasDedicatedPrepay_public_cn</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The resource group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxxxx</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>The region in which the instance resides. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">describeregions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The storage type.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static DescribeComponentPropetiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentPropetiesRequest self = new DescribeComponentPropetiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComponentPropetiesRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeComponentPropetiesRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public DescribeComponentPropetiesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeComponentPropetiesRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
