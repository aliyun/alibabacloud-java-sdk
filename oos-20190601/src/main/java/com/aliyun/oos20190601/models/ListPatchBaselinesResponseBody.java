// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListPatchBaselinesResponseBody extends TeaModel {
    /**
     * <p>The type of the operating system.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>gAAAAABfTgv5ewUWmNdJ3g7JVLvX70sPH90GZOVGC</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Indicates whether the patch baseline is set as the default patch baseline.</p>
     */
    @NameInMap("PatchBaselines")
    public java.util.List<ListPatchBaselinesResponseBodyPatchBaselines> patchBaselines;

    /**
     * <p>The details of the patch baselines.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPatchBaselinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPatchBaselinesResponseBody self = new ListPatchBaselinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPatchBaselinesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPatchBaselinesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPatchBaselinesResponseBody setPatchBaselines(java.util.List<ListPatchBaselinesResponseBodyPatchBaselines> patchBaselines) {
        this.patchBaselines = patchBaselines;
        return this;
    }
    public java.util.List<ListPatchBaselinesResponseBodyPatchBaselines> getPatchBaselines() {
        return this.patchBaselines;
    }

    public ListPatchBaselinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPatchBaselinesResponseBodyPatchBaselinesTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListPatchBaselinesResponseBodyPatchBaselinesTags build(java.util.Map<String, ?> map) throws Exception {
            ListPatchBaselinesResponseBodyPatchBaselinesTags self = new ListPatchBaselinesResponseBodyPatchBaselinesTags();
            return TeaModel.build(map, self);
        }

        public ListPatchBaselinesResponseBodyPatchBaselinesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListPatchBaselinesResponseBodyPatchBaselinesTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListPatchBaselinesResponseBodyPatchBaselines extends TeaModel {
        @NameInMap("ApprovedPatches")
        public java.util.List<String> approvedPatches;

        @NameInMap("ApprovedPatchesEnableNonSecurity")
        public Boolean approvedPatchesEnableNonSecurity;

        /**
         * <p>The name of the patch baseline.</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The ID of the patch baseline.</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The user who last modified the patch baseline.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Queries the details of patch baselines.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the patch baseline was last modified.</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The share type of the patch baseline.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the patch baseline.</p>
         */
        @NameInMap("OperationSystem")
        public String operationSystem;

        @NameInMap("ResourceGroupld")
        public String resourceGroupld;

        /**
         * <p>Queries the details of patch baselines.</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("Sources")
        public java.util.List<String> sources;

        @NameInMap("Tags")
        public java.util.List<ListPatchBaselinesResponseBodyPatchBaselinesTags> tags;

        /**
         * <p>The time when the patch baseline was created.</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The creator of the patch baseline.</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static ListPatchBaselinesResponseBodyPatchBaselines build(java.util.Map<String, ?> map) throws Exception {
            ListPatchBaselinesResponseBodyPatchBaselines self = new ListPatchBaselinesResponseBodyPatchBaselines();
            return TeaModel.build(map, self);
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setApprovedPatches(java.util.List<String> approvedPatches) {
            this.approvedPatches = approvedPatches;
            return this;
        }
        public java.util.List<String> getApprovedPatches() {
            return this.approvedPatches;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
            this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
            return this;
        }
        public Boolean getApprovedPatchesEnableNonSecurity() {
            return this.approvedPatchesEnableNonSecurity;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setOperationSystem(String operationSystem) {
            this.operationSystem = operationSystem;
            return this;
        }
        public String getOperationSystem() {
            return this.operationSystem;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setResourceGroupld(String resourceGroupld) {
            this.resourceGroupld = resourceGroupld;
            return this;
        }
        public String getResourceGroupld() {
            return this.resourceGroupld;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setSources(java.util.List<String> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<String> getSources() {
            return this.sources;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setTags(java.util.List<ListPatchBaselinesResponseBodyPatchBaselinesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListPatchBaselinesResponseBodyPatchBaselinesTags> getTags() {
            return this.tags;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public ListPatchBaselinesResponseBodyPatchBaselines setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
