// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeChargeModuleRequest extends TeaModel {
    /**
     * <p>The pricing unit.</p>
     * 
     * <strong>example:</strong>
     * <p>SeCU</p>
     */
    @NameInMap("ChargeUnit")
    public String chargeUnit;

    /**
     * <p>The billing type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>POSTPAY</strong>: pay-as-you-go WAF instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeChargeModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChargeModuleRequest self = new DescribeChargeModuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChargeModuleRequest setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
        return this;
    }
    public String getChargeUnit() {
        return this.chargeUnit;
    }

    public DescribeChargeModuleRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeChargeModuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeChargeModuleRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
