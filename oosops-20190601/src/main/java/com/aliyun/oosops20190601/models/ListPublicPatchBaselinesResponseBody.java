// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListPublicPatchBaselinesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PatchBaselines")
    public java.util.List<ListPublicPatchBaselinesResponseBodyPatchBaselines> patchBaselines;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPublicPatchBaselinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicPatchBaselinesResponseBody self = new ListPublicPatchBaselinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublicPatchBaselinesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicPatchBaselinesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicPatchBaselinesResponseBody setPatchBaselines(java.util.List<ListPublicPatchBaselinesResponseBodyPatchBaselines> patchBaselines) {
        this.patchBaselines = patchBaselines;
        return this;
    }
    public java.util.List<ListPublicPatchBaselinesResponseBodyPatchBaselines> getPatchBaselines() {
        return this.patchBaselines;
    }

    public ListPublicPatchBaselinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPublicPatchBaselinesResponseBodyPatchBaselines extends TeaModel {
        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Name")
        public String name;

        @NameInMap("OperationSystem")
        public String operationSystem;

        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static ListPublicPatchBaselinesResponseBodyPatchBaselines build(java.util.Map<String, ?> map) throws Exception {
            ListPublicPatchBaselinesResponseBodyPatchBaselines self = new ListPublicPatchBaselinesResponseBodyPatchBaselines();
            return TeaModel.build(map, self);
        }

        public ListPublicPatchBaselinesResponseBodyPatchBaselines setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListPublicPatchBaselinesResponseBodyPatchBaselines setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListPublicPatchBaselinesResponseBodyPatchBaselines setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPublicPatchBaselinesResponseBodyPatchBaselines setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPublicPatchBaselinesResponseBodyPatchBaselines setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListPublicPatchBaselinesResponseBodyPatchBaselines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPublicPatchBaselinesResponseBodyPatchBaselines setOperationSystem(String operationSystem) {
            this.operationSystem = operationSystem;
            return this;
        }
        public String getOperationSystem() {
            return this.operationSystem;
        }

        public ListPublicPatchBaselinesResponseBodyPatchBaselines setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public ListPublicPatchBaselinesResponseBodyPatchBaselines setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public ListPublicPatchBaselinesResponseBodyPatchBaselines setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
