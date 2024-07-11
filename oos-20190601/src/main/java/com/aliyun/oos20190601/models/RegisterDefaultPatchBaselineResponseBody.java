// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class RegisterDefaultPatchBaselineResponseBody extends TeaModel {
    /**
     * <p>The details of the patch baseline.</p>
     */
    @NameInMap("PatchBaseline")
    public RegisterDefaultPatchBaselineResponseBodyPatchBaseline patchBaseline;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D6850689-348D-59FC-AE13-BB0EDB7C4BE8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterDefaultPatchBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterDefaultPatchBaselineResponseBody self = new RegisterDefaultPatchBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterDefaultPatchBaselineResponseBody setPatchBaseline(RegisterDefaultPatchBaselineResponseBodyPatchBaseline patchBaseline) {
        this.patchBaseline = patchBaseline;
        return this;
    }
    public RegisterDefaultPatchBaselineResponseBodyPatchBaseline getPatchBaseline() {
        return this.patchBaseline;
    }

    public RegisterDefaultPatchBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RegisterDefaultPatchBaselineResponseBodyPatchBaseline extends TeaModel {
        /**
         * <p>The rules of scanning and installing patches for the specified operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PatchRules&quot;:[{&quot;PatchFilterGroup&quot;:[{&quot;Key&quot;:&quot;PatchSet&quot;,&quot;Values&quot;:[&quot;OS&quot;]},{&quot;Key&quot;:&quot;ProductFamily&quot;,&quot;Values&quot;:[&quot;Windows&quot;]},{&quot;Key&quot;:&quot;Product&quot;,&quot;Values&quot;:[&quot;Windows 10&quot;,&quot;Windows 7&quot;]},{&quot;Key&quot;:&quot;Classification&quot;,&quot;Values&quot;:[&quot;Security Updates&quot;,&quot;Updates&quot;,&quot;Update Rollups&quot;,&quot;Critical Updates&quot;]},{&quot;Key&quot;:&quot;Severity&quot;,&quot;Values&quot;:[&quot;Critical&quot;,&quot;Important&quot;,&quot;Moderate&quot;]}],&quot;ApproveAfterDays&quot;:7,&quot;ApproveUntilDate&quot;:&quot;&quot;,&quot;EnableNonSecurity&quot;:true,&quot;ComplianceLevel&quot;:&quot;Medium&quot;}]}</p>
         */
        @NameInMap("ApprovalRules")
        public String approvalRules;

        /**
         * <p>The user who created the patch baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The time when the patch baseline was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-07T03:42:56Z</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the patch baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>RegisterPatchBaseline</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the patch baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>pb-445340b5c6504a85a300</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the patch baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>MyPatchBaseline</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OperationSystem")
        public String operationSystem;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm4dpaq2yox6q</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The share type of the patch baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The user who last updated the patch baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the patch baseline was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-07T03:42:56Z</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static RegisterDefaultPatchBaselineResponseBodyPatchBaseline build(java.util.Map<String, ?> map) throws Exception {
            RegisterDefaultPatchBaselineResponseBodyPatchBaseline self = new RegisterDefaultPatchBaselineResponseBodyPatchBaseline();
            return TeaModel.build(map, self);
        }

        public RegisterDefaultPatchBaselineResponseBodyPatchBaseline setApprovalRules(String approvalRules) {
            this.approvalRules = approvalRules;
            return this;
        }
        public String getApprovalRules() {
            return this.approvalRules;
        }

        public RegisterDefaultPatchBaselineResponseBodyPatchBaseline setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public RegisterDefaultPatchBaselineResponseBodyPatchBaseline setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public RegisterDefaultPatchBaselineResponseBodyPatchBaseline setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RegisterDefaultPatchBaselineResponseBodyPatchBaseline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RegisterDefaultPatchBaselineResponseBodyPatchBaseline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RegisterDefaultPatchBaselineResponseBodyPatchBaseline setOperationSystem(String operationSystem) {
            this.operationSystem = operationSystem;
            return this;
        }
        public String getOperationSystem() {
            return this.operationSystem;
        }

        public RegisterDefaultPatchBaselineResponseBodyPatchBaseline setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public RegisterDefaultPatchBaselineResponseBodyPatchBaseline setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public RegisterDefaultPatchBaselineResponseBodyPatchBaseline setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public RegisterDefaultPatchBaselineResponseBodyPatchBaseline setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
