// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdatePatchBaselineResponseBody extends TeaModel {
    /**
     * <p>The details of the patch baseline.</p>
     */
    @NameInMap("PatchBaseline")
    public UpdatePatchBaselineResponseBodyPatchBaseline patchBaseline;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePatchBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePatchBaselineResponseBody self = new UpdatePatchBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePatchBaselineResponseBody setPatchBaseline(UpdatePatchBaselineResponseBodyPatchBaseline patchBaseline) {
        this.patchBaseline = patchBaseline;
        return this;
    }
    public UpdatePatchBaselineResponseBodyPatchBaseline getPatchBaseline() {
        return this.patchBaseline;
    }

    public UpdatePatchBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePatchBaselineResponseBodyPatchBaselineTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static UpdatePatchBaselineResponseBodyPatchBaselineTags build(java.util.Map<String, ?> map) throws Exception {
            UpdatePatchBaselineResponseBodyPatchBaselineTags self = new UpdatePatchBaselineResponseBodyPatchBaselineTags();
            return TeaModel.build(map, self);
        }

        public UpdatePatchBaselineResponseBodyPatchBaselineTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdatePatchBaselineResponseBodyPatchBaselineTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class UpdatePatchBaselineResponseBodyPatchBaseline extends TeaModel {
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
         * <p>The creator of the patch baseline.</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The time when the patch baseline was created.</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the patch baseline.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the patch baseline.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the patch baseline.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operating system.</p>
         */
        @NameInMap("OperationSystem")
        public String operationSystem;

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
         * <p>The share type of the patch baseline.</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The patch source configurations.</p>
         */
        @NameInMap("Sources")
        public java.util.List<String> sources;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<UpdatePatchBaselineResponseBodyPatchBaselineTags> tags;

        /**
         * <p>The user who updated the patch baseline.</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the patch baseline was updated.</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static UpdatePatchBaselineResponseBodyPatchBaseline build(java.util.Map<String, ?> map) throws Exception {
            UpdatePatchBaselineResponseBodyPatchBaseline self = new UpdatePatchBaselineResponseBodyPatchBaseline();
            return TeaModel.build(map, self);
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setApprovalRules(String approvalRules) {
            this.approvalRules = approvalRules;
            return this;
        }
        public String getApprovalRules() {
            return this.approvalRules;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setApprovedPatches(java.util.List<String> approvedPatches) {
            this.approvedPatches = approvedPatches;
            return this;
        }
        public java.util.List<String> getApprovedPatches() {
            return this.approvedPatches;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
            this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
            return this;
        }
        public Boolean getApprovedPatchesEnableNonSecurity() {
            return this.approvedPatchesEnableNonSecurity;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setOperationSystem(String operationSystem) {
            this.operationSystem = operationSystem;
            return this;
        }
        public String getOperationSystem() {
            return this.operationSystem;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setRejectedPatches(java.util.List<String> rejectedPatches) {
            this.rejectedPatches = rejectedPatches;
            return this;
        }
        public java.util.List<String> getRejectedPatches() {
            return this.rejectedPatches;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setRejectedPatchesAction(String rejectedPatchesAction) {
            this.rejectedPatchesAction = rejectedPatchesAction;
            return this;
        }
        public String getRejectedPatchesAction() {
            return this.rejectedPatchesAction;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setSources(java.util.List<String> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<String> getSources() {
            return this.sources;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setTags(java.util.List<UpdatePatchBaselineResponseBodyPatchBaselineTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<UpdatePatchBaselineResponseBodyPatchBaselineTags> getTags() {
            return this.tags;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public UpdatePatchBaselineResponseBodyPatchBaseline setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
