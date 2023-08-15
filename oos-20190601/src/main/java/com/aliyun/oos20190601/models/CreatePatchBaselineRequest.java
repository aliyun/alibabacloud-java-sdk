// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreatePatchBaselineRequest extends TeaModel {
    /**
     * <p>The rules of scanning and installing patches for the specified operating system.</p>
     */
    @NameInMap("ApprovalRules")
    public String approvalRules;

    @NameInMap("ApprovedPatches")
    public java.util.List<String> approvedPatches;

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
    public java.util.List<String> rejectedPatches;

    @NameInMap("RejectedPatchesAction")
    public String rejectedPatchesAction;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Sources")
    public java.util.List<String> sources;

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
        @NameInMap("Key")
        public String key;

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
