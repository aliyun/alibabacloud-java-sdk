// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdatePatchBaselineResponseBody extends TeaModel {
    @NameInMap("PatchBaseline")
    public UpdatePatchBaselineResponseBodyPatchBaseline patchBaseline;

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

    public static class UpdatePatchBaselineResponseBodyPatchBaseline extends TeaModel {
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

        public UpdatePatchBaselineResponseBodyPatchBaseline setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
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
