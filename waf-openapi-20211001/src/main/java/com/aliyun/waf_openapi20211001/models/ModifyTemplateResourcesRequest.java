// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyTemplateResourcesRequest extends TeaModel {
    /**
     * <p>The protected object groups that you want to associate with the protection rule template. Specify the value of this parameter in the [&quot;group1&quot;,&quot;group2&quot;,...] format.</p>
     */
    @NameInMap("BindResourceGroups")
    public java.util.List<String> bindResourceGroups;

    /**
     * <p>The protected objects that you want to associate with the protection rule template. Specify the value of this parameter in the [&quot;XX1&quot;,&quot;XX2&quot;,...] format.</p>
     */
    @NameInMap("BindResources")
    public java.util.List<String> bindResources;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to obtain the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou:</strong> the Chinese mainland.</li>
     * <li><strong>ap-southeast-1:</strong> outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The ID of the protection rule template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2291</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The protected object groups that you want to disassociate from the protection rule template. Specify the value of this parameter in the [&quot;group1&quot;,&quot;group2&quot;,...] format.</p>
     */
    @NameInMap("UnbindResourceGroups")
    public java.util.List<String> unbindResourceGroups;

    /**
     * <p>The protected objects that you want to disassociate from the protection rule template. Specify the value of this parameter in the [&quot;XX1&quot;,&quot;XX2&quot;,...] format.</p>
     */
    @NameInMap("UnbindResources")
    public java.util.List<String> unbindResources;

    public static ModifyTemplateResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateResourcesRequest self = new ModifyTemplateResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateResourcesRequest setBindResourceGroups(java.util.List<String> bindResourceGroups) {
        this.bindResourceGroups = bindResourceGroups;
        return this;
    }
    public java.util.List<String> getBindResourceGroups() {
        return this.bindResourceGroups;
    }

    public ModifyTemplateResourcesRequest setBindResources(java.util.List<String> bindResources) {
        this.bindResources = bindResources;
        return this;
    }
    public java.util.List<String> getBindResources() {
        return this.bindResources;
    }

    public ModifyTemplateResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTemplateResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyTemplateResourcesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyTemplateResourcesRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ModifyTemplateResourcesRequest setUnbindResourceGroups(java.util.List<String> unbindResourceGroups) {
        this.unbindResourceGroups = unbindResourceGroups;
        return this;
    }
    public java.util.List<String> getUnbindResourceGroups() {
        return this.unbindResourceGroups;
    }

    public ModifyTemplateResourcesRequest setUnbindResources(java.util.List<String> unbindResources) {
        this.unbindResources = unbindResources;
        return this;
    }
    public java.util.List<String> getUnbindResources() {
        return this.unbindResources;
    }

}
