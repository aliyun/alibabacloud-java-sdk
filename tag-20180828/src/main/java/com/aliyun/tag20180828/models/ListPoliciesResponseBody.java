// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListPoliciesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the next query is required.</p>
     * <br>
     * <p>*   If the value of this parameter is empty (`"NextToken": ""`), all results are returned, and the next query is not required.</p>
     * <p>*   If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The tag policies.</p>
     */
    @NameInMap("PolicyList")
    public java.util.List<ListPoliciesResponseBodyPolicyList> policyList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesResponseBody self = new ListPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPoliciesResponseBody setPolicyList(java.util.List<ListPoliciesResponseBodyPolicyList> policyList) {
        this.policyList = policyList;
        return this;
    }
    public java.util.List<ListPoliciesResponseBodyPolicyList> getPolicyList() {
        return this.policyList;
    }

    public ListPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPoliciesResponseBodyPolicyList extends TeaModel {
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
         * <p>The ID of the tag policy.</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

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

        public static ListPoliciesResponseBodyPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponseBodyPolicyList self = new ListPoliciesResponseBodyPolicyList();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponseBodyPolicyList setPolicyContent(String policyContent) {
            this.policyContent = policyContent;
            return this;
        }
        public String getPolicyContent() {
            return this.policyContent;
        }

        public ListPoliciesResponseBodyPolicyList setPolicyDesc(String policyDesc) {
            this.policyDesc = policyDesc;
            return this;
        }
        public String getPolicyDesc() {
            return this.policyDesc;
        }

        public ListPoliciesResponseBodyPolicyList setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListPoliciesResponseBodyPolicyList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesResponseBodyPolicyList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
