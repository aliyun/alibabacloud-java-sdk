// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the tag policy.</p>
     */
    @NameInMap("Policy")
    public GetPolicyResponseBodyPolicy policy;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyResponseBody self = new GetPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyResponseBody setPolicy(GetPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public GetPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public GetPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPolicyResponseBodyPolicy extends TeaModel {
        /**
         * <p>The document of the tag policy.</p>
         */
        @NameInMap("PolicyContent")
        public String policyContent;

        /**
         * <p>The description of the tag policy.</p>
         */
        @NameInMap("PolicyDesc")
        public String policyDesc;

        /**
         * <p>The name of the tag policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The mode of the Tag Policy feature. Valid values:</p>
         * <br>
         * <p>*   USER: single-account mode</p>
         * <p>*   RD: multi-account mode</p>
         * <br>
         * <p>For more information about the modes of the Tag Policy feature, see [Modes of the Tag Policy feature](~~417434~~).</p>
         */
        @NameInMap("UserType")
        public String userType;

        public static GetPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicy self = new GetPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicy setPolicyContent(String policyContent) {
            this.policyContent = policyContent;
            return this;
        }
        public String getPolicyContent() {
            return this.policyContent;
        }

        public GetPolicyResponseBodyPolicy setPolicyDesc(String policyDesc) {
            this.policyDesc = policyDesc;
            return this;
        }
        public String getPolicyDesc() {
            return this.policyDesc;
        }

        public GetPolicyResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetPolicyResponseBodyPolicy setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
