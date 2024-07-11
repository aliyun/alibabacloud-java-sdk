// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreatePatchBaselineRequest extends TeaModel {
    /**
     * <p>The rules of scanning and installing patches for the specified operating system.</p>
     * <p>This parameter is required.</p>
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
    public java.util.List<String> approvedPatches;

    /**
     * <p>Specifies whether the approved patch involves updates other than security-related updates.</p>
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
     * <p>PatchBaseline</p>
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
     * <p>The type of the operating system. Valid values:</p>
     * <ul>
     * <li>Windows</li>
     * <li>Ubuntu</li>
     * <li>CentOS</li>
     * <li>Debian</li>
     * <li>AliyunLinux</li>
     * <li>RedhatEnterpriseLinux</li>
     * <li>Anolis</li>
     * <li>AlmaLinux</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OperationSystem")
    public String operationSystem;

    /**
     * <p>The ID of the region in which you want to create a patch baseline.</p>
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
    public java.util.List<String> rejectedPatches;

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
    public java.util.List<String> sources;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreatePatchBaselineRequestTags> tags;

    public static CreatePatchBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePatchBaselineRequest self = new CreatePatchBaselineRequest();
        return TeaModel.build(map, self);
    }

    public CreatePatchBaselineRequest setApprovalRules(String approvalRules) {
        this.approvalRules = approvalRules;
        return this;
    }
    public String getApprovalRules() {
        return this.approvalRules;
    }

    public CreatePatchBaselineRequest setApprovedPatches(java.util.List<String> approvedPatches) {
        this.approvedPatches = approvedPatches;
        return this;
    }
    public java.util.List<String> getApprovedPatches() {
        return this.approvedPatches;
    }

    public CreatePatchBaselineRequest setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        return this;
    }
    public Boolean getApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
    }

    public CreatePatchBaselineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePatchBaselineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePatchBaselineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePatchBaselineRequest setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
        return this;
    }
    public String getOperationSystem() {
        return this.operationSystem;
    }

    public CreatePatchBaselineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePatchBaselineRequest setRejectedPatches(java.util.List<String> rejectedPatches) {
        this.rejectedPatches = rejectedPatches;
        return this;
    }
    public java.util.List<String> getRejectedPatches() {
        return this.rejectedPatches;
    }

    public CreatePatchBaselineRequest setRejectedPatchesAction(String rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
        return this;
    }
    public String getRejectedPatchesAction() {
        return this.rejectedPatchesAction;
    }

    public CreatePatchBaselineRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePatchBaselineRequest setSources(java.util.List<String> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<String> getSources() {
        return this.sources;
    }

    public CreatePatchBaselineRequest setTags(java.util.List<CreatePatchBaselineRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreatePatchBaselineRequestTags> getTags() {
        return this.tags;
    }

    public static class CreatePatchBaselineRequestTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePatchBaselineRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreatePatchBaselineRequestTags self = new CreatePatchBaselineRequestTags();
            return TeaModel.build(map, self);
        }

        public CreatePatchBaselineRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePatchBaselineRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
