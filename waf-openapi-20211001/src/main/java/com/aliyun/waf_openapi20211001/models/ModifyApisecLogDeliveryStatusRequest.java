// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecLogDeliveryStatusRequest extends TeaModel {
    /**
     * <p>The type of the API security log delivery. Valid values:</p>
     * <ul>
     * <li><p><strong>risk</strong>: threat information.</p>
     * </li>
     * <li><p><strong>event</strong>: attack event information.</p>
     * </li>
     * <li><p><strong>asset</strong>: asset information.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>risk</p>
     */
    @NameInMap("AssertKey")
    public String assertKey;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3_public_cn-uqm2z****0a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region in which the WAF instance resides. Valid values:</p>
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
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>Indicates whether the API security log subscription is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The API security log subscription is enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: The API security log subscription is disabled.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static ModifyApisecLogDeliveryStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecLogDeliveryStatusRequest self = new ModifyApisecLogDeliveryStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApisecLogDeliveryStatusRequest setAssertKey(String assertKey) {
        this.assertKey = assertKey;
        return this;
    }
    public String getAssertKey() {
        return this.assertKey;
    }

    public ModifyApisecLogDeliveryStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyApisecLogDeliveryStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyApisecLogDeliveryStatusRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyApisecLogDeliveryStatusRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
