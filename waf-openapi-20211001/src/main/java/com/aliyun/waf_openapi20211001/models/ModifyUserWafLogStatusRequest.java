// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyUserWafLogStatusRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-mp9153****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the log storage region. If this parameter is not specified, Simple Log Service is enabled in the region where the WAF instance resides.</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the default region where Simple Log Service is enabled for a WAF instance in the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: the default region where Simple Log Service is enabled for a WAF instance outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/2712598.html">DescribeUserSlsLogRegions</a> to query the available log storage regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("LogRegionId")
    public String logRegionId;

    /**
     * <p>Indicates whether Simple Log Service is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Simple Log Service is disabled.</p>
     * </li>
     * <li><p><strong>1</strong>: Simple Log Service is enabled.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogStatus")
    public Integer logStatus;

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
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static ModifyUserWafLogStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserWafLogStatusRequest self = new ModifyUserWafLogStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserWafLogStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserWafLogStatusRequest setLogRegionId(String logRegionId) {
        this.logRegionId = logRegionId;
        return this;
    }
    public String getLogRegionId() {
        return this.logRegionId;
    }

    public ModifyUserWafLogStatusRequest setLogStatus(Integer logStatus) {
        this.logStatus = logStatus;
        return this;
    }
    public Integer getLogStatus() {
        return this.logStatus;
    }

    public ModifyUserWafLogStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUserWafLogStatusRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
