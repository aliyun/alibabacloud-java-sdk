// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetPatchBaselineResponseBody extends TeaModel {
    /**
     * <p>The details of the patch baseline.</p>
     */
    @NameInMap("PatchBaseline")
    public GetPatchBaselineResponseBodyPatchBaseline patchBaseline;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPatchBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPatchBaselineResponseBody self = new GetPatchBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPatchBaselineResponseBody setPatchBaseline(GetPatchBaselineResponseBodyPatchBaseline patchBaseline) {
        this.patchBaseline = patchBaseline;
        return this;
    }
    public GetPatchBaselineResponseBodyPatchBaseline getPatchBaseline() {
        return this.patchBaseline;
    }

    public GetPatchBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPatchBaselineResponseBodyPatchBaselineTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static GetPatchBaselineResponseBodyPatchBaselineTags build(java.util.Map<String, ?> map) throws Exception {
            GetPatchBaselineResponseBodyPatchBaselineTags self = new GetPatchBaselineResponseBodyPatchBaselineTags();
            return TeaModel.build(map, self);
        }

        public GetPatchBaselineResponseBodyPatchBaselineTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetPatchBaselineResponseBodyPatchBaselineTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetPatchBaselineResponseBodyPatchBaseline extends TeaModel {
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
         * <p>Indicates whether the patch baseline is set as the default patch baseline.</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

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
        public java.util.List<GetPatchBaselineResponseBodyPatchBaselineTags> tags;

        /**
         * <p>The user who last modified the patch baseline.</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the patch baseline was last modified.</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static GetPatchBaselineResponseBodyPatchBaseline build(java.util.Map<String, ?> map) throws Exception {
            GetPatchBaselineResponseBodyPatchBaseline self = new GetPatchBaselineResponseBodyPatchBaseline();
            return TeaModel.build(map, self);
        }

        public GetPatchBaselineResponseBodyPatchBaseline setApprovalRules(String approvalRules) {
            this.approvalRules = approvalRules;
            return this;
        }
        public String getApprovalRules() {
            return this.approvalRules;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setApprovedPatches(java.util.List<String> approvedPatches) {
            this.approvedPatches = approvedPatches;
            return this;
        }
        public java.util.List<String> getApprovedPatches() {
            return this.approvedPatches;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
            this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
            return this;
        }
        public Boolean getApprovedPatchesEnableNonSecurity() {
            return this.approvedPatchesEnableNonSecurity;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setOperationSystem(String operationSystem) {
            this.operationSystem = operationSystem;
            return this;
        }
        public String getOperationSystem() {
            return this.operationSystem;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setRejectedPatches(java.util.List<String> rejectedPatches) {
            this.rejectedPatches = rejectedPatches;
            return this;
        }
        public java.util.List<String> getRejectedPatches() {
            return this.rejectedPatches;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setRejectedPatchesAction(String rejectedPatchesAction) {
            this.rejectedPatchesAction = rejectedPatchesAction;
            return this;
        }
        public String getRejectedPatchesAction() {
            return this.rejectedPatchesAction;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setSources(java.util.List<String> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<String> getSources() {
            return this.sources;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setTags(java.util.List<GetPatchBaselineResponseBodyPatchBaselineTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetPatchBaselineResponseBodyPatchBaselineTags> getTags() {
            return this.tags;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public GetPatchBaselineResponseBodyPatchBaseline setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
