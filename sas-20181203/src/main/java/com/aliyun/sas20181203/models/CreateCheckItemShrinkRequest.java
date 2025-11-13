// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCheckItemShrinkRequest extends TeaModel {
    /**
     * <p>Help information for the check item.</p>
     */
    @NameInMap("AssistInfo")
    public String assistInfoShrink;

    /**
     * <p>Definition rule for the custom check item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AssociatedData&quot;:{&quot;ToDataList&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;FromPropertyPath&quot;:&quot;InstanceId&quot;}]},&quot;MatchProperty&quot;:{&quot;Operator&quot;:&quot;AND&quot;,&quot;MatchProperties&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Disk&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testId&quot;},{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testInstanceId&quot;}]}}</p>
     */
    @NameInMap("CheckRule")
    public String checkRule;

    /**
     * <p>Name of the custom check item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testCheckItemName</p>
     */
    @NameInMap("CheckShowName")
    public String checkShowName;

    /**
     * <p>Description information of the check item.</p>
     */
    @NameInMap("Description")
    public String descriptionShrink;

    /**
     * <p>Sub-asset type of the cloud product.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> API to get this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DISK</p>
     */
    @NameInMap("InstanceSubType")
    public String instanceSubType;

    /**
     * <p>Asset type of the cloud product.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> API to get this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Remark information.</p>
     * 
     * <strong>example:</strong>
     * <p>remark</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Risk level of the check item. Values:</p>
     * <ul>
     * <li><strong>HIGH</strong>: High risk</li>
     * <li><strong>MEDIUM</strong>: Medium risk</li>
     * <li><strong>LOW</strong>: Low risk</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LOW</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>Array of section IDs associated with the check item.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SectionIds")
    public java.util.List<Long> sectionIds;

    /**
     * <p>Solution information for the check item.</p>
     */
    @NameInMap("Solution")
    public String solutionShrink;

    /**
     * <p>Status of the check item. Values:</p>
     * <ul>
     * <li><strong>EDIT</strong>: In editing</li>
     * <li><strong>RELEASE</strong>: Released</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Changing from <strong>Released</strong> to <strong>In editing</strong> will clear all historical records</li>
     * <li>Only the <strong>Released</strong> status allows the use of the check item for inspection.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EDIT</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Cloud asset vendor.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> API to get the available vendors.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static CreateCheckItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckItemShrinkRequest self = new CreateCheckItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCheckItemShrinkRequest setAssistInfoShrink(String assistInfoShrink) {
        this.assistInfoShrink = assistInfoShrink;
        return this;
    }
    public String getAssistInfoShrink() {
        return this.assistInfoShrink;
    }

    public CreateCheckItemShrinkRequest setCheckRule(String checkRule) {
        this.checkRule = checkRule;
        return this;
    }
    public String getCheckRule() {
        return this.checkRule;
    }

    public CreateCheckItemShrinkRequest setCheckShowName(String checkShowName) {
        this.checkShowName = checkShowName;
        return this;
    }
    public String getCheckShowName() {
        return this.checkShowName;
    }

    public CreateCheckItemShrinkRequest setDescriptionShrink(String descriptionShrink) {
        this.descriptionShrink = descriptionShrink;
        return this;
    }
    public String getDescriptionShrink() {
        return this.descriptionShrink;
    }

    public CreateCheckItemShrinkRequest setInstanceSubType(String instanceSubType) {
        this.instanceSubType = instanceSubType;
        return this;
    }
    public String getInstanceSubType() {
        return this.instanceSubType;
    }

    public CreateCheckItemShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateCheckItemShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateCheckItemShrinkRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public CreateCheckItemShrinkRequest setSectionIds(java.util.List<Long> sectionIds) {
        this.sectionIds = sectionIds;
        return this;
    }
    public java.util.List<Long> getSectionIds() {
        return this.sectionIds;
    }

    public CreateCheckItemShrinkRequest setSolutionShrink(String solutionShrink) {
        this.solutionShrink = solutionShrink;
        return this;
    }
    public String getSolutionShrink() {
        return this.solutionShrink;
    }

    public CreateCheckItemShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateCheckItemShrinkRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
