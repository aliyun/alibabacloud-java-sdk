// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreatePatchBaselineShrinkRequest extends TeaModel {
    /**
     * <p>The rules of scanning and installing patches for the specified operating system.</p>
     */
    @NameInMap("ApprovalRules")
    public String approvalRules;

    @NameInMap("ApprovedPatches")
    public String approvedPatchesShrink;

    @NameInMap("ApprovedPatchesEnableNonSecurity")
    public Boolean approvedPatchesEnableNonSecurity;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the patch baseline.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the patch baseline.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the operating system. Valid values:</p>
     * <br>
     * <p>*   Windows</p>
     * <p>*   Ubuntu</p>
     * <p>*   CentOS</p>
     * <p>*   Debian</p>
     * <p>*   AliyunLinux</p>
     * <p>*   RedhatEnterpriseLinux</p>
     * <p>*   Anolis</p>
     * <p>*   AlmaLinux</p>
     */
    @NameInMap("OperationSystem")
    public String operationSystem;

    /**
     * <p>The ID of the region in which you want to create a patch baseline.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RejectedPatches")
    public String rejectedPatchesShrink;

    @NameInMap("RejectedPatchesAction")
    public String rejectedPatchesAction;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Sources")
    public String sourcesShrink;

    @NameInMap("Tags")
    public String tagsShrink;

    public static CreatePatchBaselineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePatchBaselineShrinkRequest self = new CreatePatchBaselineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePatchBaselineShrinkRequest setApprovalRules(String approvalRules) {
        this.approvalRules = approvalRules;
        return this;
    }
    public String getApprovalRules() {
        return this.approvalRules;
    }

    public CreatePatchBaselineShrinkRequest setApprovedPatchesShrink(String approvedPatchesShrink) {
        this.approvedPatchesShrink = approvedPatchesShrink;
        return this;
    }
    public String getApprovedPatchesShrink() {
        return this.approvedPatchesShrink;
    }

    public CreatePatchBaselineShrinkRequest setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        return this;
    }
    public Boolean getApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
    }

    public CreatePatchBaselineShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePatchBaselineShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePatchBaselineShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePatchBaselineShrinkRequest setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
        return this;
    }
    public String getOperationSystem() {
        return this.operationSystem;
    }

    public CreatePatchBaselineShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePatchBaselineShrinkRequest setRejectedPatchesShrink(String rejectedPatchesShrink) {
        this.rejectedPatchesShrink = rejectedPatchesShrink;
        return this;
    }
    public String getRejectedPatchesShrink() {
        return this.rejectedPatchesShrink;
    }

    public CreatePatchBaselineShrinkRequest setRejectedPatchesAction(String rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
        return this;
    }
    public String getRejectedPatchesAction() {
        return this.rejectedPatchesAction;
    }

    public CreatePatchBaselineShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePatchBaselineShrinkRequest setSourcesShrink(String sourcesShrink) {
        this.sourcesShrink = sourcesShrink;
        return this;
    }
    public String getSourcesShrink() {
        return this.sourcesShrink;
    }

    public CreatePatchBaselineShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
