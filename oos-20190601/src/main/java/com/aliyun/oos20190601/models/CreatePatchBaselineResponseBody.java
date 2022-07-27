// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreatePatchBaselineResponseBody extends TeaModel {
    @NameInMap("PatchBaseline")
    public CreatePatchBaselineResponseBodyPatchBaseline patchBaseline;

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

    public static class CreatePatchBaselineResponseBodyPatchBaseline extends TeaModel {
        @NameInMap("ApprovalRules")
        public String approvalRules;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

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

        public CreatePatchBaselineResponseBodyPatchBaseline setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
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
