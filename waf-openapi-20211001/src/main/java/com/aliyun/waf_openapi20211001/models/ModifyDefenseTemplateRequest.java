// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseTemplateRequest extends TeaModel {
    /**
     * <p>The description of the protection template that you want to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The details of the template. For more information, see the Detail parameter in <a href="https://help.aliyun.com/document_detail/461613.html">CreateDefenseTemplate</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;trafficFeature&quot;:&quot;{\&quot;global\&quot;:0,\&quot;excludeStatus\&quot;:1,\&quot;conditions\&quot;:[{\&quot;key\&quot;:\&quot;URL\&quot;,\&quot;opValue\&quot;:\&quot;not-contain\&quot;,\&quot;values\&quot;:\&quot;test\&quot;}]}&quot;}</p>
     */
    @NameInMap("Detail")
    public String detail;

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
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
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
     * <p>The ID of the protection template that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7392</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The name of the protection template that you want to modify. The name must be 1 to 255 characters in length and can contain Chinese characters, letters, digits, underscores (_), periods (.), and hyphens (-).</p>
     * <blockquote>
     * <p>Template names within the same protection scenario (<strong>DefenseScene</strong>) must be unique.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ModifyDefenseTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseTemplateRequest self = new ModifyDefenseTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDefenseTemplateRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public ModifyDefenseTemplateRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyDefenseTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDefenseTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDefenseTemplateRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyDefenseTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ModifyDefenseTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
