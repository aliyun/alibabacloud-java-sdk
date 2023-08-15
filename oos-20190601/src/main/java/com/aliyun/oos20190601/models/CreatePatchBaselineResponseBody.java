// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreatePatchBaselineResponseBody extends TeaModel {
    /**
     * <p>The details of the patch baseline.</p>
     */
    @NameInMap("PatchBaseline")
    public CreatePatchBaselineResponseBodyPatchBaseline patchBaseline;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePatchBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePatchBaselineResponseBody self = new CreatePatchBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePatchBaselineResponseBody setPatchBaseline(CreatePatchBaselineResponseBodyPatchBaseline patchBaseline) {
        this.patchBaseline = patchBaseline;
        return this;
    }
    public CreatePatchBaselineResponseBodyPatchBaseline getPatchBaseline() {
        return this.patchBaseline;
    }

    public CreatePatchBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePatchBaselineResponseBodyPatchBaselineTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static CreatePatchBaselineResponseBodyPatchBaselineTags build(java.util.Map<String, ?> map) throws Exception {
            CreatePatchBaselineResponseBodyPatchBaselineTags self = new CreatePatchBaselineResponseBodyPatchBaselineTags();
            return TeaModel.build(map, self);
        }

        public CreatePatchBaselineResponseBodyPatchBaselineTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreatePatchBaselineResponseBodyPatchBaselineTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreatePatchBaselineResponseBodyPatchBaseline extends TeaModel {
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
         * <p>The type of the operating system.</p>
         */
        @NameInMap("OperationSystem")
        public String operationSystem;

        @NameInMap("RejectedPatches")
        public java.util.List<String> rejectedPatches;

        @NameInMap("RejectedPatchesAction")
        public String rejectedPatchesAction;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The share type of the patch baseline.</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("Sources")
        public java.util.List<String> sources;

        @NameInMap("Tags")
        public java.util.List<CreatePatchBaselineResponseBodyPatchBaselineTags> tags;

        /**
         * <p>The Alibaba Cloud account that last modified the information about the patch baseline.</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the information about the patch baseline was last modified.</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static CreatePatchBaselineResponseBodyPatchBaseline build(java.util.Map<String, ?> map) throws Exception {
            CreatePatchBaselineResponseBodyPatchBaseline self = new CreatePatchBaselineResponseBodyPatchBaseline();
            return TeaModel.build(map, self);
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setApprovalRules(String approvalRules) {
            this.approvalRules = approvalRules;
            return this;
        }
        public String getApprovalRules() {
            return this.approvalRules;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setApprovedPatches(java.util.List<String> approvedPatches) {
            this.approvedPatches = approvedPatches;
            return this;
        }
        public java.util.List<String> getApprovedPatches() {
            return this.approvedPatches;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
            this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
            return this;
        }
        public Boolean getApprovedPatchesEnableNonSecurity() {
            return this.approvedPatchesEnableNonSecurity;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setOperationSystem(String operationSystem) {
            this.operationSystem = operationSystem;
            return this;
        }
        public String getOperationSystem() {
            return this.operationSystem;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setRejectedPatches(java.util.List<String> rejectedPatches) {
            this.rejectedPatches = rejectedPatches;
            return this;
        }
        public java.util.List<String> getRejectedPatches() {
            return this.rejectedPatches;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setRejectedPatchesAction(String rejectedPatchesAction) {
            this.rejectedPatchesAction = rejectedPatchesAction;
            return this;
        }
        public String getRejectedPatchesAction() {
            return this.rejectedPatchesAction;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setSources(java.util.List<String> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<String> getSources() {
            return this.sources;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setTags(java.util.List<CreatePatchBaselineResponseBodyPatchBaselineTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreatePatchBaselineResponseBodyPatchBaselineTags> getTags() {
            return this.tags;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public CreatePatchBaselineResponseBodyPatchBaseline setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
