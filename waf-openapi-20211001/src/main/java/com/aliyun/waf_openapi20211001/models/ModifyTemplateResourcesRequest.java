// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyTemplateResourcesRequest extends TeaModel {
    /**
     * <p>The protected object groups that you want to associate with the protection rule template. Specify the value of this parameter in the ["group1","group2",...] format.</p>
     */
    @NameInMap("BindResourceGroups")
    public java.util.List<String> bindResourceGroups;

    /**
     * <p>The protected objects that you want to associate with the protection rule template. Specify the value of this parameter in the ["XX1","XX2",...] format.</p>
     */
    @NameInMap("BindResources")
    public java.util.List<String> bindResources;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](https://help.aliyun.com/document_detail/433756.html) operation to obtain the ID of the WAF instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou:** the Chinese mainland.</p>
     * <p>*   **ap-southeast-1:** outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The ID of the protection rule template.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The protected object groups that you want to disassociate from the protection rule template. Specify the value of this parameter in the ["group1","group2",...] format.</p>
     */
    @NameInMap("UnbindResourceGroups")
    public java.util.List<String> unbindResourceGroups;

    /**
     * <p>The protected objects that you want to disassociate from the protection rule template. Specify the value of this parameter in the ["XX1","XX2",...] format.</p>
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
