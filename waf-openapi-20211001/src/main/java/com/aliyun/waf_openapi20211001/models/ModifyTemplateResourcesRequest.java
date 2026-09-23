// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyTemplateResourcesRequest extends TeaModel {
    /**
     * <p>The IDs of the protected assets to associate, in the format of [&quot;XX1&quot;,&quot;XX2&quot;,...].</p>
     */
    @NameInMap("BindAssets")
    public java.util.List<String> bindAssets;

    /**
     * <p>The protected object groups to associate, in the format of [<strong>&quot;group1&quot;,&quot;group2&quot;,...</strong>].</p>
     */
    @NameInMap("BindResourceGroups")
    public java.util.List<String> bindResourceGroups;

    /**
     * <p>The protected objects to associate, in the format of [<strong>&quot;XX1&quot;,&quot;XX2&quot;,...</strong>].</p>
     */
    @NameInMap("BindResources")
    public java.util.List<String> bindResources;

    /**
     * <p>Specifies whether to enable the dry run mode. If you do not specify this parameter, a normal request is sent. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: A dry run request is sent. The system checks whether the request meets the execution conditions without performing the specified operation. If the dry run fails, the corresponding error code is returned. If the dry run succeeds, the error code Defense.Control.DryRunOperation is returned.</li>
     * <li><strong>false</strong>: A normal request is sent. The specified operation is performed after the request passes the check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
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
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The ID of the protection template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2291</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The IDs of the protected assets to disassociate, in the format of [&quot;XX1&quot;,&quot;XX2&quot;,...].</p>
     */
    @NameInMap("UnbindAssets")
    public java.util.List<String> unbindAssets;

    /**
     * <p>The protected object groups to disassociate, in the format of [<strong>&quot;group1&quot;,&quot;group2&quot;,...</strong>].</p>
     */
    @NameInMap("UnbindResourceGroups")
    public java.util.List<String> unbindResourceGroups;

    /**
     * <p>The protected objects to disassociate, in the format of [<strong>&quot;XX1&quot;,&quot;XX2&quot;,...</strong>].</p>
     */
    @NameInMap("UnbindResources")
    public java.util.List<String> unbindResources;

    public static ModifyTemplateResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateResourcesRequest self = new ModifyTemplateResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateResourcesRequest setBindAssets(java.util.List<String> bindAssets) {
        this.bindAssets = bindAssets;
        return this;
    }
    public java.util.List<String> getBindAssets() {
        return this.bindAssets;
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

    public ModifyTemplateResourcesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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

    public ModifyTemplateResourcesRequest setUnbindAssets(java.util.List<String> unbindAssets) {
        this.unbindAssets = unbindAssets;
        return this;
    }
    public java.util.List<String> getUnbindAssets() {
        return this.unbindAssets;
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
