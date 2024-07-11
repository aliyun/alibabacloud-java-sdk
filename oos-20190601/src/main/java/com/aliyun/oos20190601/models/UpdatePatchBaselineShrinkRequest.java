// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdatePatchBaselineShrinkRequest extends TeaModel {
    /**
     * <p>The rules of scanning and installing patches for the specified operating system.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PatchRules&quot;:[{&quot;PatchFilterGroup&quot;:[{&quot;Key&quot;:&quot;PatchSet&quot;,&quot;Values&quot;:[&quot;OS&quot;]},{&quot;Key&quot;:&quot;ProductFamily&quot;,&quot;Values&quot;:[&quot;Windows&quot;]},{&quot;Key&quot;:&quot;Product&quot;,&quot;Values&quot;:[&quot;Windows 10&quot;,&quot;Windows 7&quot;]},{&quot;Key&quot;:&quot;Classification&quot;,&quot;Values&quot;:[&quot;Security Updates&quot;,&quot;Updates&quot;,&quot;Update Rollups&quot;,&quot;Critical Updates&quot;]},{&quot;Key&quot;:&quot;Severity&quot;,&quot;Values&quot;:[&quot;Critical&quot;,&quot;Important&quot;,&quot;Moderate&quot;]}],&quot;ApproveAfterDays&quot;:7,&quot;ApproveUntilDate&quot;:&quot;&quot;,&quot;EnableNonSecurity&quot;:true,&quot;ComplianceLevel&quot;:&quot;Medium&quot;}]}</p>
     */
    @NameInMap("ApprovalRules")
    public String approvalRules;

    /**
     * <p>The approved patches.</p>
     */
    @NameInMap("ApprovedPatches")
    public String approvedPatchesShrink;

    /**
     * <p>Indicates whether the approved patch involves updates other than security-related updates.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ApprovedPatchesEnableNonSecurity")
    public Boolean approvedPatchesEnableNonSecurity;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the patch baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdatePatchBaseline</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the patch baseline.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyPatchBaseline</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The rejected patches.</p>
     */
    @NameInMap("RejectedPatches")
    public String rejectedPatchesShrink;

    /**
     * <p>The action of the rejected patch.</p>
     * 
     * <strong>example:</strong>
     * <p>ALLOW_AS_DEPENDENCY</p>
     */
    @NameInMap("RejectedPatchesAction")
    public String rejectedPatchesAction;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The patch source configurations.</p>
     */
    @NameInMap("Sources")
    public String sourcesShrink;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static UpdatePatchBaselineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePatchBaselineShrinkRequest self = new UpdatePatchBaselineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePatchBaselineShrinkRequest setApprovalRules(String approvalRules) {
        this.approvalRules = approvalRules;
        return this;
    }
    public String getApprovalRules() {
        return this.approvalRules;
    }

    public UpdatePatchBaselineShrinkRequest setApprovedPatchesShrink(String approvedPatchesShrink) {
        this.approvedPatchesShrink = approvedPatchesShrink;
        return this;
    }
    public String getApprovedPatchesShrink() {
        return this.approvedPatchesShrink;
    }

    public UpdatePatchBaselineShrinkRequest setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        return this;
    }
    public Boolean getApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
    }

    public UpdatePatchBaselineShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdatePatchBaselineShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePatchBaselineShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePatchBaselineShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePatchBaselineShrinkRequest setRejectedPatchesShrink(String rejectedPatchesShrink) {
        this.rejectedPatchesShrink = rejectedPatchesShrink;
        return this;
    }
    public String getRejectedPatchesShrink() {
        return this.rejectedPatchesShrink;
    }

    public UpdatePatchBaselineShrinkRequest setRejectedPatchesAction(String rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
        return this;
    }
    public String getRejectedPatchesAction() {
        return this.rejectedPatchesAction;
    }

    public UpdatePatchBaselineShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdatePatchBaselineShrinkRequest setSourcesShrink(String sourcesShrink) {
        this.sourcesShrink = sourcesShrink;
        return this;
    }
    public String getSourcesShrink() {
        return this.sourcesShrink;
    }

    public UpdatePatchBaselineShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
