// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListPatchBaselinesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PatchBaselines")
    public java.util.List<ListPatchBaselinesResponseBodyPatchBaselines> patchBaselines;

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

    public static class ListPatchBaselinesResponseBodyPatchBaselines extends TeaModel {
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

        public static ListPatchBaselinesResponseBodyPatchBaselines build(java.util.Map<String, ?> map) throws Exception {
            ListPatchBaselinesResponseBodyPatchBaselines self = new ListPatchBaselinesResponseBodyPatchBaselines();
            return TeaModel.build(map, self);
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

        public ListPatchBaselinesResponseBodyPatchBaselines setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
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
