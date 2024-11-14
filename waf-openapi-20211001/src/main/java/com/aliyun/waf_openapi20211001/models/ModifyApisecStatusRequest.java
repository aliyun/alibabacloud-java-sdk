// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecStatusRequest extends TeaModel {
    /**
     * <p>The status of the API security module. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApisecStatus")
    public Integer apisecStatus;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-tl32ast****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region in which the Web Application Firewall (WAF) instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the protected object group to which the protected object belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("ResourceGroups")
    public String resourceGroups;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The name of the protected object.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-wewbb23dfset***</p>
     */
    @NameInMap("Resources")
    public String resources;

    public static ModifyApisecStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecStatusRequest self = new ModifyApisecStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApisecStatusRequest setApisecStatus(Integer apisecStatus) {
        this.apisecStatus = apisecStatus;
        return this;
    }
    public Integer getApisecStatus() {
        return this.apisecStatus;
    }

    public ModifyApisecStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyApisecStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyApisecStatusRequest setResourceGroups(String resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }
    public String getResourceGroups() {
        return this.resourceGroups;
    }

    public ModifyApisecStatusRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyApisecStatusRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
