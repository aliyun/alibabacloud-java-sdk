// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdatePatchBaselineRequest extends TeaModel {
    /**
     * <p>The rules of scanning and installing patches for the specified operating system.</p>
     */
    @NameInMap("ApprovalRules")
    public String approvalRules;

    /**
     * <p>The approved patches.</p>
     */
    @NameInMap("ApprovedPatches")
    public java.util.List<String> approvedPatches;

    /**
     * <p>Indicates whether the approved patch involves updates other than security-related updates.</p>
     */
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
     * <p>The ID of the region.</p>
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
     */
    @NameInMap("RejectedPatchesAction")
    public String rejectedPatchesAction;

    /**
     * <p>The ID of the resource group.</p>
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
    public java.util.List<UpdatePatchBaselineRequestTags> tags;

    public static UpdatePatchBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePatchBaselineRequest self = new UpdatePatchBaselineRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePatchBaselineRequest setApprovalRules(String approvalRules) {
        this.approvalRules = approvalRules;
        return this;
    }
    public String getApprovalRules() {
        return this.approvalRules;
    }

    public UpdatePatchBaselineRequest setApprovedPatches(java.util.List<String> approvedPatches) {
        this.approvedPatches = approvedPatches;
        return this;
    }
    public java.util.List<String> getApprovedPatches() {
        return this.approvedPatches;
    }

    public UpdatePatchBaselineRequest setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        return this;
    }
    public Boolean getApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
    }

    public UpdatePatchBaselineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdatePatchBaselineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePatchBaselineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePatchBaselineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePatchBaselineRequest setRejectedPatches(java.util.List<String> rejectedPatches) {
        this.rejectedPatches = rejectedPatches;
        return this;
    }
    public java.util.List<String> getRejectedPatches() {
        return this.rejectedPatches;
    }

    public UpdatePatchBaselineRequest setRejectedPatchesAction(String rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
        return this;
    }
    public String getRejectedPatchesAction() {
        return this.rejectedPatchesAction;
    }

    public UpdatePatchBaselineRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdatePatchBaselineRequest setSources(java.util.List<String> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<String> getSources() {
        return this.sources;
    }

    public UpdatePatchBaselineRequest setTags(java.util.List<UpdatePatchBaselineRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdatePatchBaselineRequestTags> getTags() {
        return this.tags;
    }

    public static class UpdatePatchBaselineRequestTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdatePatchBaselineRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdatePatchBaselineRequestTags self = new UpdatePatchBaselineRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdatePatchBaselineRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdatePatchBaselineRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
