// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCheckPolicyResponseBody extends TeaModel {
    @NameInMap("Policys")
    public java.util.List<DeleteCheckPolicyResponseBodyPolicys> policys;

    /**
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCheckPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCheckPolicyResponseBody self = new DeleteCheckPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCheckPolicyResponseBody setPolicys(java.util.List<DeleteCheckPolicyResponseBodyPolicys> policys) {
        this.policys = policys;
        return this;
    }
    public java.util.List<DeleteCheckPolicyResponseBodyPolicys> getPolicys() {
        return this.policys;
    }

    public DeleteCheckPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteCheckPolicyResponseBodyPolicys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000000000001</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <strong>example:</strong>
         * <p>testPolicyName</p>
         */
        @NameInMap("PolicyShowName")
        public String policyShowName;

        /**
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DeleteCheckPolicyResponseBodyPolicys build(java.util.Map<String, ?> map) throws Exception {
            DeleteCheckPolicyResponseBodyPolicys self = new DeleteCheckPolicyResponseBodyPolicys();
            return TeaModel.build(map, self);
        }

        public DeleteCheckPolicyResponseBodyPolicys setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DeleteCheckPolicyResponseBodyPolicys setPolicyShowName(String policyShowName) {
            this.policyShowName = policyShowName;
            return this;
        }
        public String getPolicyShowName() {
            return this.policyShowName;
        }

        public DeleteCheckPolicyResponseBodyPolicys setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
