// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCheckItemShrinkRequest extends TeaModel {
    /**
     * <p>The help information for the check item.</p>
     */
    @NameInMap("AssistInfo")
    public String assistInfoShrink;

    /**
     * <p>The ID of the custom check item to update.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCheckItems~~">ListCheckItems</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000000001</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The definition rule of the custom check item.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AssociatedData&quot;:{&quot;ToDataList&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;FromPropertyPath&quot;:&quot;InstanceId&quot;}]},&quot;MatchProperty&quot;:{&quot;Operator&quot;:&quot;AND&quot;,&quot;MatchProperties&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Disk&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testId&quot;},{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testInstanceId&quot;}]}}</p>
     */
    @NameInMap("CheckRule")
    public String checkRule;

    /**
     * <p>The name of the custom check item.</p>
     * 
     * <strong>example:</strong>
     * <p>testCheckItemName</p>
     */
    @NameInMap("CheckShowName")
    public String checkShowName;

    /**
     * <p>The description of the check item.</p>
     */
    @NameInMap("Description")
    public String descriptionShrink;

    /**
     * <p>The asset subtype of the cloud service.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DISK</p>
     */
    @NameInMap("InstanceSubType")
    public String instanceSubType;

    /**
     * <p>The asset type of the cloud service.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>remark.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The risk level of the check item. Valid values:</p>
     * <ul>
     * <li><strong>HIGH</strong>: High.</li>
     * <li><strong>MEDIUM</strong>: Medium.</li>
     * <li><strong>LOW</strong>: Low.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The IDs of the sections associated with the check item.</p>
     */
    @NameInMap("SectionIds")
    public java.util.List<Long> sectionIds;

    /**
     * <p>The solution information for the check item.</p>
     */
    @NameInMap("Solution")
    public String solutionShrink;

    /**
     * <p>The status of the check item. Valid values:</p>
     * <ul>
     * <li><strong>EDIT</strong>: Being edited.</li>
     * <li><strong>RELEASE</strong>: Published.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Changing the status from <strong>Published</strong> to <strong>Being edited</strong> purges all historical records.</li>
     * <li>Only check items in the <strong>Published</strong> status can be used for checks.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The cloud asset vendor.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> operation to obtain the available vendors.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static UpdateCheckItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckItemShrinkRequest self = new UpdateCheckItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCheckItemShrinkRequest setAssistInfoShrink(String assistInfoShrink) {
        this.assistInfoShrink = assistInfoShrink;
        return this;
    }
    public String getAssistInfoShrink() {
        return this.assistInfoShrink;
    }

    public UpdateCheckItemShrinkRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public UpdateCheckItemShrinkRequest setCheckRule(String checkRule) {
        this.checkRule = checkRule;
        return this;
    }
    public String getCheckRule() {
        return this.checkRule;
    }

    public UpdateCheckItemShrinkRequest setCheckShowName(String checkShowName) {
        this.checkShowName = checkShowName;
        return this;
    }
    public String getCheckShowName() {
        return this.checkShowName;
    }

    public UpdateCheckItemShrinkRequest setDescriptionShrink(String descriptionShrink) {
        this.descriptionShrink = descriptionShrink;
        return this;
    }
    public String getDescriptionShrink() {
        return this.descriptionShrink;
    }

    public UpdateCheckItemShrinkRequest setInstanceSubType(String instanceSubType) {
        this.instanceSubType = instanceSubType;
        return this;
    }
    public String getInstanceSubType() {
        return this.instanceSubType;
    }

    public UpdateCheckItemShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpdateCheckItemShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateCheckItemShrinkRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public UpdateCheckItemShrinkRequest setSectionIds(java.util.List<Long> sectionIds) {
        this.sectionIds = sectionIds;
        return this;
    }
    public java.util.List<Long> getSectionIds() {
        return this.sectionIds;
    }

    public UpdateCheckItemShrinkRequest setSolutionShrink(String solutionShrink) {
        this.solutionShrink = solutionShrink;
        return this;
    }
    public String getSolutionShrink() {
        return this.solutionShrink;
    }

    public UpdateCheckItemShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateCheckItemShrinkRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
